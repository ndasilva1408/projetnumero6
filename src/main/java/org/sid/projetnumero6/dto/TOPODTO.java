package org.sid.projetnumero6.dto;

import lombok.*;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Place;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter



public class TOPODTO {

    private Long id;
    private MemberDTO member;
    private PlaceDTO place;


    private String name;
    private String description;
    private boolean available;
    private String urlimg;
}
