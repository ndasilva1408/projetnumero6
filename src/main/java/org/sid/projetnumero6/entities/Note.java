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
public class Note implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Long id;

    @ManyToOne(targetEntity = Member.class,cascade = CascadeType.ALL)
     private Member member;

    @ManyToOne(targetEntity = TOPO.class,cascade = CascadeType.ALL)
    private TOPO topo;

    @ManyToOne
    @JoinColumn(name = "place_id")

    private Place place;
    private String text;





}
