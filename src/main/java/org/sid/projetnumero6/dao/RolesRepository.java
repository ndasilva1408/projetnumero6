package org.sid.projetnumero6.dao;

import org.sid.projetnumero6.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RolesRepository extends JpaRepository<Roles,Long> {
    Roles findRolesByRangEquals(String rang);

}
