import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> data = new HashSet<>();
        data.add("e1") ;
        data.add("e2") ;
        data.add("e3") ;
        data.add("e4") ;
        data.add("e3") ;

        System.out.println(data);

        Set<Employee> emps = new HashSet<>();
        Employee e1  = new Employee(5000 , "ahmad" , true);
        Employee e2  = new Employee(2000 , "tine" , false);
        Employee e3  = new Employee(3000 , "nilufar" , true);
        Employee e4  = new Employee(3000 , "nilufar" , true);



        Collections.addAll(emps , e1, e2 , e3 ,e4) ;

        System.out.println(emps);
    }
}
