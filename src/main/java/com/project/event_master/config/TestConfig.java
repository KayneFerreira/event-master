package com.project.event_master.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.event_master.entities.PhysicalAddress;
import com.project.event_master.entities.UserEntity;
import com.project.event_master.entities.enums.State;
import com.project.event_master.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        
        UserEntity u1 = new UserEntity.Builder()
            .name("Roberto Rongo")
            .cpf("33333333333")
            .birthDate(LocalDate.of(1987, 2, 15))
            .email("roberto.rongo@email.com")
            .phoneNumber("11988776654")
            .username("robrongo")
            .password("123456")
            .address(new PhysicalAddress.Builder()
                .street("Rua do Teste Doido, 123")
                .addressComplement(null)
                .zipCode("0331589")
                .district("Distrito Doido")
                .city("Doido City")
                .state(State.ACRE)
                .build()
            )
            .build();
        userRepo.save(u1);
    }

}
