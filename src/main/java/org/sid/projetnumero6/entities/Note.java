package org.sid.projetnumero6.entities;


import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor @AllArgsConstructor
@Getter
@Setter

@Entity
public class Note implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Long id;

    @ManyToOne
     private Member member;

    @Nullable
    @ManyToOne
    private TOPO topo;

    @Nullable
    @ManyToOne
    private Place place;

    private String text;





}
