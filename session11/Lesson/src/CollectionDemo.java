import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {

        Collection<Employee> emps = new ArrayList<>() ;
        Employee e1  = new Employee(1000 , "ahmad" , true);
        Employee e2  = new Employee(2000 , "tine" , false);
        Employee e3  = new Employee(3000 , "mina" , true);
        Employee e1copy  = new Employee(1000 , "ahmad" , true);

        //Collections.addAll(emps , e1 , e2 , e3 ) ;

        emps.add(e1) ;
        emps.add(e2) ;
        emps.add(e3) ;

        Employee[] arrayofEmps  = emps.toArray(new Employee[3]);
        System.out.println("-----" + Arrays.toString(arrayofEmps));
        System.out.println("-----" + arrayofEmps.length);
        System.out.println("-----" + arrayofEmps[0]);


        System.out.println("check if empty : " + emps.isEmpty());
        System.out.println("check if contains e1 : " + emps.contains(e1));
        System.out.println("check if contains e1 copy : " + emps.contains(e1copy));
        System.out.println("size : " + emps.size());
        //emps.clear();
        System.out.println("empty after clearing : " + emps.isEmpty());
        System.out.println("size after being cleared : " + emps.size());

       // emps.retainAll();



        Collection<Employee> emps2 = new ArrayList<>() ;
        Employee e4  = new Employee(500 , "sara" , true);
        Employee e5  = new Employee(700 , "tara" , true);


        emps2.add(e4) ;
        emps2.add(e5) ;
        emps2.add(e1) ;


//        emps.addAll(emps2) ;
//        System.out.println("==============================================");
//        System.out.println(emps);
//        System.out.println(emps.size());


//        emps.retainAll(emps2) ;
//        System.out.println("==============================================");
//        System.out.println(emps);
//        System.out.println(emps.size());


//        emps.removeAll(emps2) ;
//        System.out.println("==============================================");
//        System.out.println(emps);
//        System.out.println(emps.size());





    }
}
