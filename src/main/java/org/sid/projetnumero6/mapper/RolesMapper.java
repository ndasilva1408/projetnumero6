package org.sid.projetnumero6.mapper;

import org.mapstruct.Mapper;
import org.sid.projetnumero6.dto.RolesDTO;
import org.sid.projetnumero6.entities.Roles;

@Mapper(componentModel = "spring")
public interface RolesMapper {

    RolesDTO toRoles(Roles roles);

    Roles toDTO(RolesDTO rolesDTO);

}
