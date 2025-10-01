package com.project.event_master.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.project.event_master.domain.EventEntity;
import com.project.event_master.dtos.event.CreateEventDTO;
import com.project.event_master.dtos.event.EventResponseDTO;
import com.project.event_master.dtos.event.UpdateEventDTO;

@Mapper(config = BaseMapperConfig.class)
public interface EventMapper {

    @Mapping(target = "id", ignore = true)
    EventEntity toEntity(CreateEventDTO dto);

    EventResponseDTO toDto(EventEntity entity);

    List<EventResponseDTO> toDtoList(List<EventEntity> entities);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDto(UpdateEventDTO dto, @MappingTarget EventEntity entity);

}
