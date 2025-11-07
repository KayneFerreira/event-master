package com.project.event_master.dtos.event;

import com.project.event_master.dtos.address.CreateAddressDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateEventDTO {

    /*
        TODO:
            [ ] Fill attributes
    */
	
    private String title;

    private CreateAddressDTO eventAddress;
    
    private EventAuthorDTO eventAuthor;

}
