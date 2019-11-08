package org.sid.projetnumero6.dto;

import lombok.*;
import org.sid.projetnumero6.entities.Member;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter


//commentaire

public class NoteDTO {

    private Long id;
    private MemberDTO member;
    private Long text;

}
