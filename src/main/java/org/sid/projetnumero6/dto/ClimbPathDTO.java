package org.sid.projetnumero6.dto;

import lombok.*;




@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter



public class ClimbPathDTO{
    private Long id;
    private TOPODTO topo;

    private String lvl;
    private String name;


}
