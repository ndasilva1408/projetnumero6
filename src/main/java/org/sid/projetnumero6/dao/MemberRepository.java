package org.sid.projetnumero6.dao;


import org.sid.projetnumero6.entities.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource

public interface MemberRepository extends JpaRepository<Member,Long> {

 Member findMemberByLoginEquals(String login);

 Member findByLogin(String login);

 Member findByEmail(String email);

 Member findMemberById(Long id);










}


