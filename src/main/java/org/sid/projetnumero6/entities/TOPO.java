package org.sid.projetnumero6.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;

import java.io.Serializable;
import java.util.List;


@NoArgsConstructor @AllArgsConstructor
@Getter
@Setter

@Entity
public class TOPO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )


    private Long id;


    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
    private List<Member> member;
    

    @ManyToOne
    private Place place;

    @OneToMany(mappedBy = "topo")
    List<Note> noteList;

    @OneToMany(mappedBy = "topo")
    List<ClimbPath> climbPathList;

    private String name;
    private String description;
    private boolean available;
    private String urlimg;



}
