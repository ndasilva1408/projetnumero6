package org.sid.projetnumero6.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.sid.projetnumero6.dto.TOPODTO;
import org.sid.projetnumero6.entities.Place;
import org.sid.projetnumero6.entities.TOPO;

@Mapper(componentModel = "spring")

public interface TOPOMapper  {

    TOPOMapper INSTANCE = Mappers.getMapper(TOPOMapper.class);
    @Mapping(target = "place", source = "place")
    @Mapping(target="id",source = "id")




    TOPODTO toTOPO(TOPO topo);


    @Mapping(target = "place", source = "place")
    @Mapping(target="id",source = "id")





    TOPO toDTO(TOPODTO topoDTO);



}
