package lambda.PredicateLambda;

import java.util.function.Predicate;

public class Pred {
    public static Predicate<Integer> possitiveIntegerPred = i1 -> i1 > 0;

    /* public static Predicate<Integer> getSpecificNumber(Integer argument){
        return new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer == argument;
            }
        };
    }*/

    public static Predicate<Integer> getSpecificNumber(Integer argument){
        return (i ->  i == argument);
            }
        }




