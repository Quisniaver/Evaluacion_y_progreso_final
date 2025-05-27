package com.EvaluacionesyProgresos.EvaluacionesyProgresos.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Evaluacion {

        @Id
        private Long id;

     @OneToOne
     @JoinColumn(name = "estudiante_id", nullable = false)
     private Estudiante estudiante;

    @JoinColumn(name = "Nombre_Evaluacion", nullable = false)
        private String nombreEvaluacion;
    @JoinColumn(name = "Fecha", nullable = false)
        private LocalDate fecha;
    @JoinColumn(name = "nota", nullable = false)
        private Double nota;
    @JoinColumn(name = "tipo", nullable = false)
        private String tipo;
    @JoinColumn(name = "comentarios", nullable = false)
        private String comentarios;
    }

