package org.sid.projetnumero6.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.sid.projetnumero6.dto.NoteDTO;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Note;

@Mapper(componentModel = "spring")

public interface NoteMapper  {


    @Mapping(target = "member", source = "member")
    NoteDTO toNote(Note note);

    @Mapping(target = "member", source = "member")
    Note toDTO(NoteDTO noteDTO);


}
