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

public class Certificacion {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @OneToOne
        @JoinColumn(name = "estudiante_id", nullable = false)
        private Estudiante estudiante;


    @JoinColumn(name = "Nombre_Certificacion", nullable = false)
        private String nombreCertificacion;
    @JoinColumn(name = "fechaEmision", nullable = false)
        private LocalDate fechaEmision;
    @JoinColumn(name = "estado", nullable = false)
        private String estado;
    @JoinColumn(name = "promedio", nullable = false)
        private Double promedioFinal;
    }

