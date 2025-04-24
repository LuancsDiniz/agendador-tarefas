package com.luanProject.agendadortarefas.controller;

import com.luanProject.agendadortarefas.business.TarefasService;
import com.luanProject.agendadortarefas.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefas")
@RequiredArgsConstructor
public class TarefasController {

    private final TarefasService tarefasService;

    @PostMapping
    public ResponseEntity<TarefasDTO> gravarTarefas(@RequestBody TarefasDTO dto,
                                                    @RequestHeader("Authotization") String token){
        return ResponseEntity.ok(tarefasService.gravarTarefa(token, dto));
    }
}
