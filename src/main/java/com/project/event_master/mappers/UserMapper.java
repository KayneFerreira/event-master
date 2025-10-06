package com.project.event_master.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.project.event_master.domain.entities.UserEntity;
import com.project.event_master.dtos.user.CreateUserDTO;
import com.project.event_master.dtos.user.UpdateUserDTO;
import com.project.event_master.dtos.user.UserResponseDTO;

@Mapper(config = BaseMapperConfig.class)
public interface UserMapper {

    UserEntity toEntity(CreateUserDTO dto);

    UserResponseDTO toDto(UserEntity entity);

    List<UserResponseDTO> toDtoList(List<UserEntity> entities);

    void updateEntityFromDto(UpdateUserDTO dto, @MappingTarget UserEntity entity);

}
