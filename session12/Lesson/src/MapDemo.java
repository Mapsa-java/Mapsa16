import java.util.*;

public class MapDemo {


    public static void main(String[] args) {

        SortedMap<String , Integer> ages = new TreeMap<>() ;


        System.out.println(ages.put("mina", 25));
        System.out.println(ages.put("saeed", 32));
        System.out.println(ages.put("ali", 22));

        System.out.println(ages);

        ages.remove("mina") ;
        System.out.println("========================");
        System.out.println(ages);
        System.out.println("======================");
        System.out.println(ages.putIfAbsent("ali", 38));
        System.out.println(ages);

       Integer saraAge =  ages.getOrDefault("sara" , 0) ;
        System.out.println("sara age : " + saraAge);

        System.out.println(ages);

        System.out.println("=================================");
        for (String key : ages.keySet()) {
            System.out.println("key is : " + key);
            System.out.println("value is : " + ages.get(key));
        }

        int sum = 0 ;

        for (Integer age  : ages.values()) {
            sum  += age ;
        }

        System.out.println("sum is : " + sum);

        System.out.println("============================");

        System.out.println(ages.entrySet());
        Set<Map.Entry<String ,  Integer>> entries = ages.entrySet() ;

        for(Map.Entry<String ,  Integer> entryItem : ages.entrySet()){
            System.out.println("my key : "+ entryItem.getKey());
            System.out.println("my value : "+ entryItem.getValue());

        }




       // ages.
    }
}
