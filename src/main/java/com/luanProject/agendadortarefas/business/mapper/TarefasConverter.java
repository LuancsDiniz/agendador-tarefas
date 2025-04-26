package com.luanProject.agendadortarefas.business.mapper;

import com.luanProject.agendadortarefas.business.dto.TarefasDTO;
import com.luanProject.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataEvento", target = "dataEvento")
    @Mapping(source = "dataCriacao", target = "dataCriacao")
    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

    List<TarefasEntity> paraListTarefaEntity(List<TarefasDTO> dtos);

    List<TarefasDTO> paraListTarefaDTO(List<TarefasEntity> entities);
}
