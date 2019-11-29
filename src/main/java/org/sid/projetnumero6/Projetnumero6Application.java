package org.sid.projetnumero6;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dao.RolesRepository;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Roles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Projetnumero6Application {

    public static void main(String[] args) {
       ApplicationContext ctx= SpringApplication.run(Projetnumero6Application.class, args);

//---- Creation super user--------------
 /*      MemberRepository memberRepository=ctx.getBean(MemberRepository.class);
        RolesRepository rolesRepository=ctx.getBean(RolesRepository.class);
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        List<Roles> rolesList=new ArrayList<>();
       Roles roles;
       roles= rolesRepository.findRolesByRangEquals("ADMIN");
        rolesList.add(roles);
       memberRepository.save(new Member(Long.parseLong("1"),null,roles,null,null,null,"SuperUser",bCryptPasswordEncoder.encode("password"),null,null,null,null,null,null,null,false,true));
//---- INSERTION ROLE ------------------


        rolesRepository.save(new Roles(Long.parseLong("1"),null,"ADMIN"));
        rolesRepository.save(new Roles(Long.parseLong("2"),null,"MEMBRE"));
        rolesRepository.save(new Roles(Long.parseLong("3"),null,"INVITE"));
*/

      }

}
