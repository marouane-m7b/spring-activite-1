package net.mahboub.springactivite1.repositories;

import net.mahboub.springactivite1.entities.BankAccount;
import net.mahboub.springactivite1.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "bankAccounts")
public interface BankAccountRespository extends JpaRepository<BankAccount, String> {
    @RestResource(path = "byType")
    List<BankAccount> findByType(@Param("t") AccountType type);
}
