package org.sid.projetnumero6.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@NoArgsConstructor @AllArgsConstructor
@Getter
@Setter

@Entity
public class Place implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Long id;



    @OneToMany (targetEntity = Note.class,mappedBy = "place")

    private List<Note> note;

    @OneToMany(targetEntity = TOPO.class,mappedBy = "place")

    private List<TOPO> topo;


    private String name;




}
