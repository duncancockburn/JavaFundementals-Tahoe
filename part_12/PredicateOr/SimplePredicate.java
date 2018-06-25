package part_12.PredicateOr;
import java.util.function.Predicate;


public class SimplePredicate {
        public static void main(String[] args)
        {
            // Creating predicate
            Predicate<Integer> lessthan = i -> (i < 18);

            // Calling Predicate method
            System.out.println(lessthan.test(10));
        }
    }

