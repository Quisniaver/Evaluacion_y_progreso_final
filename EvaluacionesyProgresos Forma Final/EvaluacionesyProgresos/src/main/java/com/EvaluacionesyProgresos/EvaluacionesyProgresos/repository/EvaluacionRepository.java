package com.EvaluacionesyProgresos.EvaluacionesyProgresos.repository;

import com.EvaluacionesyProgresos.EvaluacionesyProgresos.modelo.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {
    List<Evaluacion> findByEstudianteId(Long estudianteId);
}