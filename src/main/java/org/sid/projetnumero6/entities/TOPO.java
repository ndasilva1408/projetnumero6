package org.sid.projetnumero6.entities;


import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
@Getter
@Setter

@Entity
public class TOPO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )


    private Long id;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
    

    @ManyToOne
    @JoinColumn(name="place_id")

    private Place place;

    @OneToMany
    @JoinColumn(name = "note_id")
    List<Note> noteList;

    @OneToMany
    @JoinColumn(name = "climbpath_id")
    List<ClimbPath> climbPathList;

    private String name;
    private String description;
    private boolean available;
    private String urlimg;



}
