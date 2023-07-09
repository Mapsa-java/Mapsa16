package org.mapsa;

import org.mapsa.entities.MaritalStatus;
import org.mapsa.entities.RelativeType;
import org.mapsa.entities.User;
import org.mapsa.service.UserService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserCrudTest {


    public static void main(String[] args) throws ParseException {

        UserService userService = new  UserService(SessionFactoryProvider.getSessionFactory()) ;

        User admin = new User("om Albanin","karami") ;
        admin.setMaritalStatus(MaritalStatus.SINGLE);
        SimpleDateFormat smp = new SimpleDateFormat("yyyy-MM-dd") ;
        admin.getLoginDate().add(smp.parse("2022-01-24"));
        admin.getLoginDate().add(smp.parse("2022-02-23"));
        admin.getLoginDate().add(smp.parse("2022-03-23"));


        admin.getChildNames().add("zahra");
        admin.getChildNames().add("ali");
        admin.getChildNames().add("fatemeh");

        admin.getRelatives().put(RelativeType.FATHER , "hossein") ;
        admin.getRelatives().put(RelativeType.MOTHER , "kosar") ;
        admin.getRelatives().put(RelativeType.SISTER , "zeinab") ;

        userService.create(admin) ;


        User hana = userService.getByName("om Albanin").get(0) ;
        hana.getLoginDate().forEach(item-> System.out.println(item));
        //hana.getLoginDate()
//        hana.getChildNames().forEach(item-> System.out.println(item));*/

        //userService.create(admin) ;


    }


}
