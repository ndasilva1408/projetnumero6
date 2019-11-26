package org.sid.projetnumero6.dto;

import lombok.*;
import org.sid.projetnumero6.entities.ClimbPath;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.mapper.ClimbPathMapper;


@Data
@NoArgsConstructor @AllArgsConstructor @ToString
@Getter
@Setter

public class BookingDTO  {


    private Long id;
    private MemberDTO member;
    private TOPODTO topo;

    private boolean demandeEnCours;

}
