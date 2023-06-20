import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedListDemo {

    public static void main(String[] args) {


      //  LinkedList<String> list = new LinkedList<>(List.of("first , second"));
     //  List<String> test = Arrays.asList("test1" , "test2" ) ;

//
//        List<String> list = new ArrayList<>(Arrays.asList("test1" , "test2"));
//        list.add("test3");
//        System.out.println(list.size());

//        Queue<String> colors = new LinkedList<>(Arrays.asList("green" , "red" , "blue"));
// // bue green red
//
//
//       // Collections.sort(colors);
//        colors.add("yellow");
//       //    colors.sort
//        Iterator<String> it = colors.iterator() ;
//        while(it.hasNext()){
//            System.out.println(it.next());
        //}


      //  colors.
        //colors.



        Deque<String> colors = new LinkedBlockingDeque<>(3);


        System.out.println(colors.offer("b"));
//        System.out.println(colors.offer("r"));
//        System.out.println(colors.offer("g"));
//        System.out.println(colors.offer("b"));

 //       System.out.println(colors.pollFirst());
  //      System.out.println(colors.pollFirst());

    }
}
