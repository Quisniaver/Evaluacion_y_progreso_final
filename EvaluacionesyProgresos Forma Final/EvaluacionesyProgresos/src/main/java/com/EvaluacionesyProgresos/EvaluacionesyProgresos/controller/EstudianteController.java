package com.EvaluacionesyProgresos.EvaluacionesyProgresos.controller;

import com.EvaluacionesyProgresos.EvaluacionesyProgresos.modelo.Estudiante;

import com.EvaluacionesyProgresos.EvaluacionesyProgresos.service.EstudianteService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
@RequiredArgsConstructor
@Data
class EstudianteController {
    private final EstudianteService estudianteService;

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante e) {
        return estudianteService.save(e);
    }

    @GetMapping
    public List<Estudiante> listar() {
        return estudianteService.findAll();
    }

    @GetMapping("/obtener-por/{id}")
    public Optional<Estudiante> obtenerPorId(@PathVariable Long id) {
        return estudianteService.findById(id);
    }

    @PutMapping("/actualizar/{id}")
    public Estudiante actualizar(@PathVariable Long id, @RequestBody Estudiante actualizado) {
        actualizado.setId(id);
        return estudianteService.save(actualizado);
    }

    @DeleteMapping("/deletear-por/{id}")
    public void eliminar(@PathVariable Long id) {
        estudianteService.delete(id);
    }
}
