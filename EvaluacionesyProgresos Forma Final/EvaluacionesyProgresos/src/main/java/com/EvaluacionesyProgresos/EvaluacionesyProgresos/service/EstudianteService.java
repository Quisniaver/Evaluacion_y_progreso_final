package com.EvaluacionesyProgresos.EvaluacionesyProgresos.service;

import com.EvaluacionesyProgresos.EvaluacionesyProgresos.modelo.Estudiante;
import com.EvaluacionesyProgresos.EvaluacionesyProgresos.repository.EstudianteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstudianteService {
    private final EstudianteRepository repository;

    public Estudiante save(Estudiante e) { return repository.save(e); }
    public List<Estudiante> findAll() { return repository.findAll(); }
    public Optional<Estudiante> findById(Long id) { return repository.findById(id); }
    public void delete(Long id) { repository.deleteById(id); }
}
