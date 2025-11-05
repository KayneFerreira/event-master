package com.project.event_master.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.project.event_master.domain.entities.CommentEntity;
import com.project.event_master.domain.entities.EventEntity;
import com.project.event_master.domain.entities.UserEntity;
import com.project.event_master.dtos.comment.CommentAuthorDTO;
import com.project.event_master.dtos.comment.CommentEventDTO;
import com.project.event_master.dtos.comment.CommentResponseDTO;
import com.project.event_master.dtos.comment.CreateCommentDTO;
import com.project.event_master.dtos.comment.UpdateCommentDTO;

@Mapper(config = BaseMapperConfig.class)
public interface CommentMapper {

    CommentEntity toEntity(CreateCommentDTO dto);

    @Mapping(target = "commentAuthor", expression = "java(mapAuthor(entity.getCommentAuthor()))")
    @Mapping(target = "commentEvent", expression = "java(mapEvent(entity.getCommentEvent()))")
    CommentResponseDTO toDto(CommentEntity entity);

    List<CommentResponseDTO> toDtoList(List<CommentEntity> entities);

    void updateEntityFromDto(UpdateCommentDTO dto, @MappingTarget CommentEntity entity);
    
    default CommentAuthorDTO mapAuthor(UserEntity user) {
        if (user == null) return null;
        return new CommentAuthorDTO(user.getId(), user.getName());
    }

    default CommentEventDTO mapEvent(EventEntity event) {
        if (event == null) return null;
        return new CommentEventDTO(event.getId(), event.getTitle());
    }

}
