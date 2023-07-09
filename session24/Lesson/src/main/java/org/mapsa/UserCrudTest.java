package org.mapsa;

import org.mapsa.entities.*;
import org.mapsa.service.UserService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserCrudTest {


    public static void main(String[] args) throws ParseException {

        UserService userService = new  UserService(SessionFactoryProvider.getSessionFactory()) ;

        User admin = new User("om Albanin","karami") ;
        admin.setMaritalStatus(MaritalStatus.MARRIED);
        SimpleDateFormat smp = new SimpleDateFormat("yyyy-MM-dd") ;
        admin.getLoginDate().add(smp.parse("2022-01-24"));
        admin.getLoginDate().add(smp.parse("2022-02-23"));
        admin.getLoginDate().add(smp.parse("2022-03-23"));


        admin.getChildNames().add("zahra");
        admin.getChildNames().add("ali");
        admin.getChildNames().add("fatemeh");

        admin.getRelatives().add(new Relative("hossein" , "karimi" , RelativeType.FATHER)) ;
        admin.getRelatives().add(new Relative("tina" , "asghari" , RelativeType.MOTHER)) ;


        Address home = new Address("tehran" , "iran") ;

        admin.setHomeAddress(home);
        userService.create(admin) ;



        //hana.getLoginDate()
//        hana.getChildNames().forEach(item-> System.out.println(item));*/

        //userService.create(admin) ;


    }


}
