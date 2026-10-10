package net.mahboub.springactivite1.repositories;

import net.mahboub.springactivite1.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "bankAccounts")
public interface BankAccountRespository extends JpaRepository<BankAccount, String> {
}
