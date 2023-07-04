package org.mapsa;

import org.mapsa.entities.User;
import org.mapsa.service.UserService;

import java.util.List;

public class UserCrudTest {


    public static void main(String[] args) {

        UserService userService = new  UserService(SessionFactoryProvider.getSessionFactory()) ;

        userService.getAll().forEach(item-> System.out.println(item));


       List<User> saras =  userService.getByName("mona") ;
        System.out.println(saras.size());


    }


}
