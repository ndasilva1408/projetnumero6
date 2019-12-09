package org.sid.projetnumero6.service;

import org.sid.projetnumero6.dto.MemberDTO;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Place;

public interface UserService {

    public boolean isMemberAlreadyPresent (Member member);


    boolean isPlaceAlreadyPresent(Place place);

    public Member changeRank(String email); }
