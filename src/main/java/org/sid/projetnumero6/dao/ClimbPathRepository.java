package org.sid.projetnumero6.dao;

import org.sid.projetnumero6.dto.ClimbPathDTO;
import org.sid.projetnumero6.entities.ClimbPath;
import org.sid.projetnumero6.entities.TOPO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryRestResource
public interface ClimbPathRepository extends JpaRepository<ClimbPath,Long> {

    @Transactional
    ClimbPath findClimbPathById(Long id);

    @Transactional
    @Query("select c from ClimbPath c where c.lvl like :x" )
    List<ClimbPath> searchByLvl (@Param("x") String mc);


}
