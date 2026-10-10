package net.mahboub.springactivite1;

import net.mahboub.springactivite1.entities.BankAccount;
import net.mahboub.springactivite1.enums.AccountType;
import net.mahboub.springactivite1.repositories.BankAccountRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class SpringActivite1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringActivite1Application.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountRespository bankAccountRepository) {
        return args -> {
            for (int i = 0; i < 10; i++) {
                BankAccount bankAccount = BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                        .balance(10000 + Math.random() * 90000)
                        .createdAt(new Date())
                        .currency("MAD")
                        .build();
                bankAccountRepository.save(bankAccount);
            }
        };
    }
}
