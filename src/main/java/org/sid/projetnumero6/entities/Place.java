package org.sid.projetnumero6.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
@Getter
@Setter

@Entity
public class Place implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Long id;

    @OneToMany (targetEntity = ClimbPath.class,mappedBy = "place",cascade = CascadeType.ALL)

    private List<ClimbPath>  climbPath;

    @OneToMany (targetEntity = Note.class,mappedBy = "place",cascade = CascadeType.ALL)

    private List<Note> note;

    @OneToMany(targetEntity = TOPO.class,mappedBy = "place",cascade = CascadeType.ALL)

    private List<TOPO> topo;


    private String name;




}
