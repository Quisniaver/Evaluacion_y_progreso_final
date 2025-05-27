package com.EvaluacionesyProgresos.EvaluacionesyProgresos.repository;

import com.EvaluacionesyProgresos.EvaluacionesyProgresos.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {}