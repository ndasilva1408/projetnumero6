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


    @ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.DETACH})
    private List<Member> member;
    

    @ManyToOne(cascade = {CascadeType.DETACH})
    private Place place;

    @OneToMany(mappedBy = "topo", fetch = FetchType.EAGER)
    List<Note> noteList;
    @OneToMany(mappedBy = "topo", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    List<ClimbPath> climbPathList;
    @OneToMany(mappedBy = "topo", fetch = FetchType.EAGER)
    List<Booking> bookingList;


    private String name;
    private String description;
    private String urlimg;
    private boolean available;
    private String dateDeParution;
    private boolean officiel= false;




}
