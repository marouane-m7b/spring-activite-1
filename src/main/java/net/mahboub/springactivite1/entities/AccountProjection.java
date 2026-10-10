package net.mahboub.springactivite1.entities;

import org.springframework.data.rest.core.config.Projection;
import net.mahboub.springactivite1.enums.AccountType;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {
    String getId();

    AccountType getType();
}
