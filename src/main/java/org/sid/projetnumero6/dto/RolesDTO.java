package org.sid.projetnumero6.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class RolesDTO {
    private Long id;
    private List<MemberDTO> role;
    private String rang;
}
