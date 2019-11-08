package org.sid.projetnumero6.dto;

import lombok.*;
import org.sid.projetnumero6.entities.Note;




@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter



public class ClimbPathDTO{
    private Long id;
    private String name;
    private PlaceDTO placeDTO;
    private String lvl;

}
