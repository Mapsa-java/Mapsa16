package com.mapsa.fi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String , Integer> toLength = str -> str.length() ;

        Function<Integer , Integer> doubleLenght = x -> 2 * x ;


        Function<String , Integer> com1 = toLength.andThen(doubleLenght) ;
        Function<String , Integer> com2 = doubleLenght.compose(toLength) ;

        System.out.println(doubleLenght.apply(12));
        System.out.println(toLength.apply("Testt"));
        System.out.println(com1.apply("Testt"));
        System.out.println(com2.apply("hasann"));

//        f(x) = x+1 ;
//        g(x) = 2*x ;
//        g(f(x))   => g(f(5))


        Map<Integer , String> toLetter = new HashMap<>();
        toLetter.put(1, "one");
        toLetter.put(2, "two");
        toLetter.put(3, "three");

       // Function< Integer , String> fun = a ->  a ;
        toLetter.computeIfAbsent(4, a -> "String value of " + a ) ;
        toLetter.computeIfAbsent(5, a -> "I am " + a) ;

        System.out.println(toLetter);


        BiFunction<String , String , Integer> combineLength = (a,b) -> (a+b).length() ;
        System.out.println(combineLength.apply("abs", "cfds"));


        BiFunction<String , String , Boolean> checkEquality = (a,b) -> a.equals(b) ;
        System.out.println("------------ : " + checkEquality.apply("abs", "cfds"));
        System.out.println("------------ : " + checkEquality.apply("abs", "abs"));

        System.out.println("====================================");
        Map<Integer , String> names = new HashMap<>();
        names.put(123, "jafar");
        names.put(456, "karim");
        names.put(546, "heshmat");
        names.put(537, "mina");
        //537   537unknown

        names.compute(537 , (a,b) ->"unknown") ;
        names.compute(342 , (a,b) -> a + b + "unknown") ;

        System.out.println(names);






    }
}
