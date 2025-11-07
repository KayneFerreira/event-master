package com.project.event_master.dtos.event;

import com.project.event_master.dtos.address.UpdateAddressDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateEventDTO {

    /*
        TODO:
            [ ] Fill attributes
    */
	
    private String title;

    private UpdateAddressDTO eventAddress;

}
