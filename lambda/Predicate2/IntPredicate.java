package lambda.Predicate2;

import java.util.function.Predicate;

public class IntPredicate {
    public static Predicate<Integer> possitiveIntegerPred = new Predicate<Integer>() {

        @Override
        public boolean test(Integer t) {
            return t > 0;
        }

    };
}