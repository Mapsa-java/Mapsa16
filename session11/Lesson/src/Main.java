import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Collection<String> data = new ArrayList<>() ;

        data.add("a1") ;
        data.add("a2") ;
        data.add("a3") ;

            for(String item : data){
                System.out.println(item);
            }


        Iterator<String> itr = data.iterator() ;

       // a1 a2 a3

//       while (itr.hasNext()){
//           System.out.println(itr.next());
//       }


    }
}