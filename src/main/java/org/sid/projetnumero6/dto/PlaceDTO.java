package org.sid.projetnumero6.dto;

import lombok.*;
import org.sid.projetnumero6.entities.ClimbPath;
import org.sid.projetnumero6.entities.Note;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter



public class PlaceDTO {

    private Long id;
    private List<NoteDTO> note;
    private List<TOPODTO> topo;
    private String name;


}
