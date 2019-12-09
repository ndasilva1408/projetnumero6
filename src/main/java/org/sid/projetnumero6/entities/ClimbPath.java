package org.sid.projetnumero6.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor @AllArgsConstructor
@Getter
@Setter

@Entity
public class ClimbPath implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @ManyToOne
    private TOPO topo;

    private String lvl;
    private String name;

}
