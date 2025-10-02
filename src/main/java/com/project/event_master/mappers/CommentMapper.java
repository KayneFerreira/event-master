package com.project.event_master.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.project.event_master.domain.CommentEntity;
import com.project.event_master.dtos.comment.CommentResponseDTO;
import com.project.event_master.dtos.comment.CreateCommentDTO;

@Mapper(config = BaseMapperConfig.class)
public interface CommentMapper {

    CommentEntity toEntity(CreateCommentDTO dto);

    CommentResponseDTO toDto(CommentEntity entity);

    List<CommentResponseDTO> toDtoList(List<CommentEntity> entities);

    void updateEntityFromDto(CommentResponseDTO dto, @MappingTarget CommentEntity entity);

}
