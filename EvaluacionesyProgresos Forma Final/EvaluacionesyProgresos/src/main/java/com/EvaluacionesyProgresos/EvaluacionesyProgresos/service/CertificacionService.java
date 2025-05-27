package com.EvaluacionesyProgresos.EvaluacionesyProgresos.service;

import com.EvaluacionesyProgresos.EvaluacionesyProgresos.modelo.Certificacion;
import com.EvaluacionesyProgresos.EvaluacionesyProgresos.repository.CertificacionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CertificacionService {
    private final CertificacionRepository repo;

    public Certificacion save(Certificacion c) { return repo.save(c); }
    public List<Certificacion> findAll() { return repo.findAll(); }
    public Optional<Certificacion> findById(Long id) { return repo.findById(id); }
    public List<Certificacion> findByEstudianteId(Long id) { return repo.findByEstudianteId(id); }
    public void delete(Long id) { repo.deleteById(id); }
}