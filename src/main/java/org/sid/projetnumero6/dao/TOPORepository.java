package org.sid.projetnumero6.dao;



import org.sid.projetnumero6.entities.Place;
import org.sid.projetnumero6.entities.TOPO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.plaf.synth.Region;
import java.util.ArrayList;


@RepositoryRestResource

public interface TOPORepository extends JpaRepository<TOPO,Long> {

    TOPO findTOPOById(Long id) ;
    @Transactional
    void deleteTOPOById(Long id );
    //mc pour mot clé


    @Transactional
    ArrayList<TOPO> findTOPOSByPlace(Place place);
    @Transactional
    ArrayList<TOPO> findTOPOSByAvailable(Boolean b);
    @Transactional
    TOPO findTOPOByName(String toponame);

    @Transactional
    @Query("select t from TOPO t where t.name like :x" + " or t.place.name like: x")
     Page<TOPO> chercher (@Param("x") String mc, Pageable pageable);






}
