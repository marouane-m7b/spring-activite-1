package net.mahboub.springactivite1.repositories;

import net.mahboub.springactivite1.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRespository extends JpaRepository<BankAccount, String> {
}
