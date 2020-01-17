package org.sid.projetnumero6.dto;

import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter



public class TOPODTO {

    private Long id;
    private List<MemberDTO> member;
    private List<PlaceDTO> place;
    private List<ClimbPathDTO> climbPathList;
    private List<NoteDTO> noteList;
    private List<BookingDTO>bookingList;


    private String name;
    private String description;
    private boolean available;
    private String dateDeParution;
    private String urlimg;
    private boolean officiel= false;
}
