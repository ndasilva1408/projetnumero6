package org.sid.projetnumero6.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ToString
@NoArgsConstructor @AllArgsConstructor
@Getter
@Setter

@Entity
public class Place implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Long id;

    @ManyToMany(mappedBy = "place", fetch = FetchType.EAGER)
    List<TOPO> topo = new ArrayList<>();


    private String name;
    private String description;
    private String factToKnow;
    private String bestMomentToGo;
    private String orientation;
    private String height;
    private String type;
    private String region;





}
