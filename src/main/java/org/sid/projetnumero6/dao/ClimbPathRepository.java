package org.sid.projetnumero6.dao;

import org.sid.projetnumero6.entities.ClimbPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClimbPathRepository extends JpaRepository<ClimbPath,Long> {

}
