package lambda.PredicateLambda;

import lambda.Predicate2.IntPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1,-2,-3,-4,-7,-10,1,2,3,4,6,8,9,0,12,44,87);

        //It takes an array ia and creates a wrapper that implements List<Integer>, which makes the original array
        //available as a list. Nothing is copied and all, only a single wrapper object is created.
        //ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia)); this is the same but not pass by ref
        //and instead just creates a new and independent copy

        List<Integer> filterednumbers = getFilterNum(numbers, IntPredicate.possitiveIntegerPred);

        //creates a list of integers called filtered numbers. this consists of information within the below method,
        //passing through the original numbers but only storing the ones which comply with the predicate method
        //calls the method and passes the numbers through- send numbers and predicate

        filterednumbers.forEach(System.out::println);

        //numbers.forEach(x -> System.out.println(x));
        //don't actually need the name x in order to invoke println for each of the elements. That's where the method
        //reference is helpful - the :: operator denotes you will be invoking the println method with a parameter
    }




    //creates new list and adds in the values which comply with the test method in pred class. returns list
    //tests whether i matches the predicate
    public static List<Integer> getFilterNum(List<Integer> numbers, Predicate<Integer> integerPredicate){
        List<Integer> filterednumbers = new ArrayList<Integer>();
        for (Integer i: numbers){
            if(integerPredicate.test(i)){
                //is this number i passing the condition in the predicate
                filterednumbers.add(i);
            }
        }
        return filterednumbers;
    }

}

