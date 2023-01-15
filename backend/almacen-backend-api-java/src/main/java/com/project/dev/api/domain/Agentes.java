/*
 * @fileoverview    {Agentes} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code Agentes}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Entity
@Table(name = "\"Agentes\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Agentes implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdAgente;
    private Integer intIdEntidad;
    private Integer intIdAlmacen;
    @Column(length = 255)
    private String strObservaciones;
    @Column(length = 255)
    private String strUsuario;
    @Basic(optional = false)
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFecha;
    @JoinColumn(name = "intIdSociedad", referencedColumnName = "intIdSociedad")
    private Long intIdSociedad;
    @JoinColumn(name = "intIdTipoAgente", referencedColumnName = "intIdTipoAgente")
    private Long intIdTipoAgente;

}
