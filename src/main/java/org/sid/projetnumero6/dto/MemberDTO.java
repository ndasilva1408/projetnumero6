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
    List<TOPODTO> topo;
    List<NoteDTO> noteList;
    RolesDTO rolesDTO;
    String login;
    String password;
    String birth_date;
    String first_name;
    String last_name;
    String address;
    String license_number;
    String climbing_lvl;

    String email;
    boolean active;
    boolean demandeDePret;



}

