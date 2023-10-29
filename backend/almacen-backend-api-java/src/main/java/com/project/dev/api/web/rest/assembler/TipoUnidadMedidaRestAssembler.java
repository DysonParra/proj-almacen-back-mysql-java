/*
 * @fileoverview    {TipoUnidadMedidaRestAssembler}
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
package com.project.dev.api.web.rest.assembler;

import com.project.dev.api.dto.TipoUnidadMedidaDTO;
import com.project.dev.api.web.rest.TipoUnidadMedidaRest;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

/**
 * TODO: Description of {@code TipoUnidadMedidaRestAssembler}.
 *
 * @author Dyson Parra
 * @since 11
 */
@Component
public class TipoUnidadMedidaRestAssembler implements RepresentationModelAssembler<TipoUnidadMedidaDTO, EntityModel<TipoUnidadMedidaDTO>> {

    /**
     * Convierte un DTO en un modelo.
     *
     * @param entityDTO DTO a convertir.
     * @return el modelo correspondiente al DTO:
     */
    @Override
    public EntityModel<TipoUnidadMedidaDTO> toModel(TipoUnidadMedidaDTO entityDTO) {
        return new EntityModel<>(entityDTO,
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(TipoUnidadMedidaRest.class).getEntity(String.valueOf(entityDTO.getIntIdTipoUnidadMedida()))).withSelfRel(),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(TipoUnidadMedidaRest.class).getAllEntities()).withRel("TipoUnidadMedida"));
    }
}
