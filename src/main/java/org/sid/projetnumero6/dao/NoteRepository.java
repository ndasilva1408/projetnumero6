package org.sid.projetnumero6.dao;

import org.mapstruct.Mapper;
import org.sid.projetnumero6.dto.NoteDTO;
import org.sid.projetnumero6.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource

public interface NoteRepository extends JpaRepository<Note,Long> {
  Note findNoteById(Long id);
  @Transactional
  Note deleteNoteById(Long id);



}
