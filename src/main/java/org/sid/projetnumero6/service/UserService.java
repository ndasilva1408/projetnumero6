package org.sid.projetnumero6.service;

import org.sid.projetnumero6.dto.MemberDTO;
import org.sid.projetnumero6.entities.Member;

public interface UserService {

    public boolean isMemberAlreadyPresent (Member member);


    public Member changeRank( String email); }
