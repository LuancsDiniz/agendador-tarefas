package com.luanProject.agendadortarefas.business.mapper;

import com.luanProject.agendadortarefas.business.dto.TarefasDTO;
import com.luanProject.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
