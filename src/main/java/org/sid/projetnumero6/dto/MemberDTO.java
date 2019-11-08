package org.sid.projetnumero6.dto;

import lombok.*;
import org.sid.projetnumero6.entities.TOPO;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter



public class MemberDTO {

    private Long id;
    TOPODTO topo;
    List<NoteDTO> noteDTOList;
    String login;
    String password;
    String birth_date;
    String first_name;
    String last_name;
    String address;
    int license_number;
    String climbing_lvl;
    String role;



}

