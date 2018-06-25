package part_12.PredicateOr;
import java.util.function.Predicate;

public class PredicateInToFunction {

        static void pred(int number, Predicate<Integer> predicate)
        {
            if (predicate.test(number)) {
                System.out.println("Number " + number);
            }
        }


        public static void main(String[] args) {
            pred(10, (i) -> i > 7);
        }
}
