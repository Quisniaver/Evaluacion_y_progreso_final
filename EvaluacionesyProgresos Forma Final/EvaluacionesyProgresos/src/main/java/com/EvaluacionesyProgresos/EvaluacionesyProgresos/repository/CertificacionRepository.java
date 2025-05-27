package com.EvaluacionesyProgresos.EvaluacionesyProgresos.repository;

import com.EvaluacionesyProgresos.EvaluacionesyProgresos.modelo.Certificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificacionRepository extends JpaRepository<Certificacion, Long> {
    List<Certificacion> findByEstudianteId(Long estudianteId);
}

