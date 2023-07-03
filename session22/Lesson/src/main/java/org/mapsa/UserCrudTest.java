package org.mapsa;

import org.mapsa.entities.Address;
import org.mapsa.entities.Credential;
import org.mapsa.entities.User;
import org.mapsa.service.UserService;

import java.util.List;

public class UserCrudTest {


    public static void main(String[] args) {

        UserService userService = new  UserService(SessionFactoryProvider.getSessionFactory()) ;
        User mona = new User("mona" , "jahromi") ;
        Credential c = new Credential("mona66" , "1234") ;
        mona.setCredential(c);
        c.setUser(mona);
        userService.create(mona) ;

        //userService.delete(mona);




        Address a1 = new Address("tehran" , "iran") ;
        Address a2 = new Address("esfahan" , "iran") ;
        a1.setUser(mona);
        a2.setUser(mona);
        List<Address> adrs = List.of(a1,a2) ;
        mona.setAddresses(adrs);

        userService.updateUser(mona); ;

        userService.delete(mona);

       // userService.delete(mona);





    }


}
