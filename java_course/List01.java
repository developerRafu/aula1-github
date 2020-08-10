package java_course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Rafu
 */
public class List01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");
        
        System.out.println(list.size());       
        
        for (String x : list){
            System.out.println(x);
        }
        
        System.out.println("=====================");
        list.removeIf(x -> x.charAt(0) == 'M');
        
         for (String x : list){
            System.out.println(x);
        }
         
         System.out.println("-------------------------");
         System.out.println(list.indexOf("Bob"));
         System.out.println(list.indexOf("Marco"));
         
         System.out.println("-------------------------");
         
         List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
                  for (String x : list){
            System.out.println(x);
        }
             System.out.println("-------------------------");     
             String name = list.stream().filter(x-> x.charAt(0) == 'J').findFirst().orElse(null);
             System.out.println(name);
    }
    
}
