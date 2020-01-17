package org.sid.projetnumero6.mapper;

import org.mapstruct.Mapper;
import org.sid.projetnumero6.dto.ClimbPathDTO;
import org.sid.projetnumero6.entities.ClimbPath;

@Mapper(componentModel = "spring")
public interface ClimbPathMapper {



    ClimbPathDTO toClimbPath(ClimbPath climbPath);


    ClimbPath toDTO(ClimbPathDTO climbPathDTO);


}
