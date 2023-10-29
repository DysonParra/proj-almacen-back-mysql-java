/*
 * @fileoverview    {CondicionesPagos}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
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
 * TODO: Description of {@code CondicionesPagos}.
 *
 * @author Dyson Parra
 * @since 11
 */
@Entity
@Table(name = "\"CondicionesPagos\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class CondicionesPagos implements Serializable {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdCondicionPago;
    @Column(length = 255)
    private String strNombreCondicion;
    @Column(length = 255)
    private String strDescripcion;
    private Boolean bitDeudor;
    private Boolean bitAcreedor;
    private Integer intDiiaFijo;
    private Integer intMesesAdicionales;
    private Integer intDiasTolerancia;
    private Integer intNumeroPlazos;
    @Column(precision = 12, scale = 0)
    private Float fltDescuentoTotal;
    @Column(precision = 12, scale = 0)
    private Float fltInteresCredito;
    @Column(precision = 10, scale = 2)
    private BigDecimal decHaberMaximo;
    @Column(length = 255)
    private String strUsuario;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFecha;

}
