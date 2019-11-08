package org.sid.projetnumero6.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.sid.projetnumero6.dto.PlaceDTO;
import org.sid.projetnumero6.entities.ClimbPath;
import org.sid.projetnumero6.entities.Place;

@Mapper(componentModel = "spring")

public interface PlaceMapper  {


    @Mapping(target = "note", source = "note")
    PlaceDTO toPlace(Place place);



    @Mapping(target = "note", source = "note")
    Place toDTO(PlaceDTO placeDTO);




}
