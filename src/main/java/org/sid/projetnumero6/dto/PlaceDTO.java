package org.sid.projetnumero6.dto;

import lombok.*;
import org.sid.projetnumero6.entities.ClimbPath;
import org.sid.projetnumero6.entities.Note;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter



public class PlaceDTO {

    private Long id;
    private ClimbPathDTO climbPath;
    private NoteDTO note;
    private String name;
    private TOPODTO topo;

}
