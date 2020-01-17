package org.sid.projetnumero6.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter



public class PlaceDTO {

    private Long id;
    private List<TOPODTO> topo;
    private String name;
    private String description;
    private String factToKnow;
    private String bestMomentToGo;
    private String orientation;
    private String height;
    private String type;
    private String region;
}
