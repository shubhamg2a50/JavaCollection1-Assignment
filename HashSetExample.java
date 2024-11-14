package pscsess;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        
        HashSet<Integer> numbers = new HashSet<>();
       
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);  
        numbers.add(40);
        numbers.add(10);  
        
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
