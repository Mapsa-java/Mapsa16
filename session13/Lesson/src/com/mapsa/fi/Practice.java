package com.mapsa.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Practice {

    public static void main(String[] args) {

        Supplier<List<Integer>> supplier = () ->{
            List<Integer> list = new ArrayList<>();
            for(int i = 1; i <101 ; i++){
                list.add(i);
            }
            return list;
        };



        List<Integer> myList = supplier.get() ;
        myList.removeIf(i-> i % 2 !=0 );
        myList.forEach(i-> System.out.println(i));


        int[] myarray = {1,2,4} ;
       // Arrays.stream(myarray).forEach(); ;
       // myList.stream().





        //1-100;
        //predicate()   even
        //chap

    }
}
