package com.EvaluacionesyProgresos.EvaluacionesyProgresos.controller;

import com.EvaluacionesyProgresos.EvaluacionesyProgresos.modelo.Certificacion;
import com.EvaluacionesyProgresos.EvaluacionesyProgresos.service.CertificacionService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/certificaciones")
@RequiredArgsConstructor
@Data
class CertificacionController {
    private CertificacionService certificacionService;

    @PostMapping
    public Certificacion crear(@RequestBody Certificacion c) {
        return certificacionService.save(c);
    }

    @GetMapping
    public List<Certificacion> listar() {
        return certificacionService.findAll();
    }

    @GetMapping("/obtener-por/{id}")
    public Optional<Certificacion> obtenerPorId(@PathVariable Long id) {
        return certificacionService.findById(id);
    }


    @PutMapping("/actualizar/{id}")
    public Certificacion actualizar(@PathVariable Long id, @RequestBody Certificacion actualizado) {
        actualizado.setId(id);
        return certificacionService.save(actualizado);
    }

    @DeleteMapping("/deletear-por/{id}")
    public void eliminar(@PathVariable Long id) {
        certificacionService.delete(id);
    }
}
