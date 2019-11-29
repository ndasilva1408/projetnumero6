package org.sid.projetnumero6.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.sid.projetnumero6.dto.MemberDTO;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.TOPO;

@Mapper(componentModel = "spring")
public interface MemberMapper  {


    @Mapping(target = "birth_date",dateFormat = "dd.MM.yyyy")



    MemberDTO toMember(Member member);




    Member toDTO(MemberDTO memberDTO);


}
