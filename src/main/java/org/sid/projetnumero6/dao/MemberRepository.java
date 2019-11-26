package org.sid.projetnumero6.dao;


import org.mapstruct.Mapper;
import org.sid.projetnumero6.dto.MemberDTO;
import org.sid.projetnumero6.entities.Member;

import org.sid.projetnumero6.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource

public interface MemberRepository extends JpaRepository<Member,Long> {

 Member findMemberByLoginEquals(String login);

 Member findByLogin(String login);

 Member findByEmail(String email);

 Member findMemberById(Long id);








}


