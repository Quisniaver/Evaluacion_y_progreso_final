package com.EvaluacionesyProgresos.EvaluacionesyProgresos.controller;

import com.EvaluacionesyProgresos.EvaluacionesyProgresos.modelo.Evaluacion;
import com.EvaluacionesyProgresos.EvaluacionesyProgresos.service.EvaluacionService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/evaluaciones")
@RequiredArgsConstructor
@Data
class EvaluacionController {
    private final EvaluacionService evaluacionService;

    @PostMapping
    public Evaluacion crear(@RequestBody Evaluacion ev) {
        return evaluacionService.save(ev);
    }

    @GetMapping
    public List<Evaluacion> listar() {
        return evaluacionService.findAll();
    }

    @GetMapping("/obtener-por/{id}")
    public Optional<Evaluacion> obtenerPorId(@PathVariable Long id) {
        return evaluacionService.findById(id);
    }


    @PutMapping("/actualizar-por/{id}")
    public Evaluacion actualizar(@PathVariable Long id, @RequestBody Evaluacion actualizado) {
        actualizado.setId(id);
        return evaluacionService.save(actualizado);
    }

    @DeleteMapping("/deletear-por/{id}")
    public void eliminar(@PathVariable Long id) {
        evaluacionService.delete(id);
    }
}