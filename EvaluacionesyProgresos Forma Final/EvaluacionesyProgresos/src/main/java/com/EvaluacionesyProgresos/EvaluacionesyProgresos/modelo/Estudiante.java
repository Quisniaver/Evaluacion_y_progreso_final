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
@Table(name = "Estudiante")
public class Estudiante {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

    @JoinColumn(name = "Nombre_Estudiante", nullable = false)
        private String nombre;
    @JoinColumn(name = "Apellido_Estudiante", nullable = false)
        private String apellido;
    @JoinColumn(name = "Correo_estudiante", nullable = false)
        private String correo;
    @JoinColumn(name = "Fecha_ingreso", nullable = false)
        private LocalDate fechaIngreso;
    }

