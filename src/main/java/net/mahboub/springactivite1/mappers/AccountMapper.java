package net.mahboub.springactivite1.mappers;

import net.mahboub.springactivite1.dto.BankAccountResponseDTO;
import net.mahboub.springactivite1.entities.BankAccount;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO toResponse(BankAccount account) {
        return BankAccountResponseDTO.builder()
                .id(account.getId())
                .createdAt(account.getCreatedAt())
                .balance(account.getBalance())
                .currency(account.getCurrency())
                .type(account.getType())
                .build();
    }
}
