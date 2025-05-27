package com.EvaluacionesyProgresos.EvaluacionesyProgresos.service;

import com.EvaluacionesyProgresos.EvaluacionesyProgresos.modelo.Evaluacion;
import com.EvaluacionesyProgresos.EvaluacionesyProgresos.repository.EvaluacionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EvaluacionService {
    private final EvaluacionRepository repo;

    public Evaluacion save(Evaluacion e) { return repo.save(e); }
    public List<Evaluacion> findAll() { return repo.findAll(); }
    public Optional<Evaluacion> findById(Long id) { return repo.findById(id); }
    public List<Evaluacion> findByEstudianteId(Long id) { return repo.findByEstudianteId(id); }
    public void delete(Long id) { repo.deleteById(id); }
}