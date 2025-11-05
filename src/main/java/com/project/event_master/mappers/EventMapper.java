package com.project.event_master.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.project.event_master.domain.entities.EventEntity;
import com.project.event_master.dtos.event.AllEventsResponseDTO;
import com.project.event_master.dtos.event.CreateEventDTO;
import com.project.event_master.dtos.event.SingleEventResponseDTO;
import com.project.event_master.dtos.event.UpdateEventDTO;

@Mapper(config = BaseMapperConfig.class)
public interface EventMapper {

    EventEntity toEntity(CreateEventDTO dto);

    SingleEventResponseDTO toSingleEventDto(EventEntity entity);
    
    AllEventsResponseDTO toAllEventsDto(EventEntity entity);

    List<AllEventsResponseDTO> toDtoList(List<EventEntity> entities);

    void updateEntityFromDto(UpdateEventDTO dto, @MappingTarget EventEntity entity);

}
