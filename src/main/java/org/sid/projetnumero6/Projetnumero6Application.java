package org.sid.projetnumero6;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Roles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Projetnumero6Application {

    public static void main(String[] args) {
       ApplicationContext ctx= SpringApplication.run(Projetnumero6Application.class, args);
       //MemberRepository memberRepository=ctx.getBean(MemberRepository.class);
       //memberRepository.save(new Member(null,null,null,"SuperUser","password",null,null,null,null,"1235546",null, Roles.ADMIN,null));
      }

}
