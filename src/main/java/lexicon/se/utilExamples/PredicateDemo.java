package lexicon.se.utilExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // boolean test(T t);
        /*
        Predicate<T>
                use Cases:
                Filtering elements in a collection.
                Select elements from a Stream
                Writing more concise and expressive code when dealing with condition(if statements)

         */
         List<Integer> numbers = new ArrayList<>() ;
 for ( int i= 1;i<=10; i++){
     numbers.add(i);

 }
 // [1,2,3,4,5,6,7,8,9,19,31]
        System.out.println(numbers);
 // [2,4,6,8,10]
         Predicate<Integer> isEven = n -> n % 2 == 0;
         Predicate<Integer> isGraterThan18 = n ->  n >18;
         Predicate<Integer> isLessThan18 = n -> n < 18;

       /*  List<Integer> filterdList = new ArrayList<>() ;

         for(Integer element : numbers) {
             if (isEven.test(element)) {
                 filterdList.add(element);
             }
         }
        System.out.println(filterdList);

        */
        System.out.println(filter(numbers,isEven));
        System.out.println(filter(numbers,isEven.negate()));
    }
    public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> Predicate)  {
        List<Integer> result = new ArrayList<>() ;
        for(Integer element : numbers) {
            if (Predicate.test(element)) {
                result.add(element) ;
            }
        }
        return result;
    }
}
