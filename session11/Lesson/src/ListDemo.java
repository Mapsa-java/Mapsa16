import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> data = new ArrayList<>() ;

        data.add("blue") ;
        data.add("red") ;
        data.add("gray") ;
        data.add("black");
        data.add("white");

        System.out.println(" zero indexed element : " + data.get(0));
        System.out.println(" zero indexed element : " + data.get(4));
        data.add("yellow");
        System.out.println(data);
        data.add(0,"yellow");
        System.out.println(data);
       // data.set(0,"brown");
       // System.out.println(data);


        System.out.println("index of yellow : " + data.indexOf("yellow"));
        System.out.println("index of yellow : " + data.lastIndexOf("yellow"));


        System.out.println("index of unknown : " + data.indexOf("unknown"));
        System.out.println("index of unknown : " + data.lastIndexOf("unknown"));


        System.out.println("sublist --- " + data.subList(2, 5));

        Collections.reverse(data);
        System.out.println("after revered base on base order : " + data);
        Collections.sort(data);
        System.out.println("sorted alphabetic----- " + data);

        Collections.reverse(data);
        System.out.println("reverse sorted alphabetic ----- " + data);
        //data.sort();

    }
}
