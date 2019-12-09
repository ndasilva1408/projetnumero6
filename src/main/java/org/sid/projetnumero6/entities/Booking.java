package org.sid.projetnumero6.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor @AllArgsConstructor
@Getter
@Setter

@Entity
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @OneToOne
    public Member owner;

    @ManyToOne
    public TOPO topo;
    @ManyToOne
    public Member booker;

    public boolean demandeEnCours=false;

}

