import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

    public static void main(String[] args) {

        List<Employee> emps = new ArrayList<>() ;

        Employee e1  = new Employee(5000 , "ahmad" , true);
        Employee e2  = new Employee(2000 , "tine" , false);
        Employee e3  = new Employee(3000 , "nilufar" , true);

        Collections.addAll(emps , e1, e2 , e3) ;

//        System.out.println("before sort : " + emps);
//        emps.sort(new SalaryBaseComparator());
//        System.out.println("after sort : " + emps);

//        Collections.sort(emps);
//        System.out.println(emps);


//        Collections.sort(emps , new NameBaseComparator());
//        System.out.println(emps);



    }
}
