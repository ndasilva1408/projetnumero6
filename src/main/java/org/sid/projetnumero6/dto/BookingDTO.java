package org.sid.projetnumero6.dto;

import lombok.*;


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
