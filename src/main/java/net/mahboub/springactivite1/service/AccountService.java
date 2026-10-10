package net.mahboub.springactivite1.service;

import net.mahboub.springactivite1.dto.BankAccountRequestDTO;
import net.mahboub.springactivite1.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO request);
}
