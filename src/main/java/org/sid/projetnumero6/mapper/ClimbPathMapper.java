package org.sid.projetnumero6.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.sid.projetnumero6.dto.ClimbPathDTO;
import org.sid.projetnumero6.entities.ClimbPath;
import org.sid.projetnumero6.entities.Note;

@Mapper(componentModel = "spring")
public interface ClimbPathMapper {



    ClimbPathDTO toClimbPath(ClimbPath climbPath);


    ClimbPath toDTO(ClimbPathDTO climbPathDTO);


}
