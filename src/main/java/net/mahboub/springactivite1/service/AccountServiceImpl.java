package net.mahboub.springactivite1.service;

import net.mahboub.springactivite1.dto.BankAccountRequestDTO;
import net.mahboub.springactivite1.dto.BankAccountResponseDTO;
import net.mahboub.springactivite1.entities.BankAccount;
import net.mahboub.springactivite1.mappers.AccountMapper;
import net.mahboub.springactivite1.repositories.BankAccountRespository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private final BankAccountRespository bankAccountRepository;
    private final AccountMapper accountMapper;

    public AccountServiceImpl(BankAccountRespository bankAccountRepository, AccountMapper accountMapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO request) {
        BankAccount account = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(new Date())
                .balance(request.getBalance())
                .type(request.getType())
                .currency(request.getCurrency())
                .build();

        BankAccount savedAccount = bankAccountRepository.save(account);
        return accountMapper.toResponse(savedAccount);
    }
}
