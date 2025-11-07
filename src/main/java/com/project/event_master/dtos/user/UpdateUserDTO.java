package com.project.event_master.dtos.user;

import java.time.LocalDate;

import com.project.event_master.domain.enums.UserRoles;
import com.project.event_master.dtos.address.UpdateAddressDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateUserDTO {

    /*
        TODO:
            [ ] Fill attributes
    */
	
    private String name;
    private LocalDate birthDate;
    private String cpf;
    
    private String username;
    private String password;
    private UserRoles role;

    private UpdateAddressDTO userAddress;

}
