package co.apples;

import java.util.List;
import java.util.function.Predicate;

public class HowManyApples implements IHowManyApples {

    private final List<Apple> apples;

    public HowManyApples(List<Apple> apples) {
        this.apples = apples;
    }

    @Override
    public int areFromArgentina() {
        return 0;
    }

    @Override
    public int areRed() {
        return 0;
    }

    @Override
    public int howManyAppleFromChinaHeavier110g() {
        return 0;
    }


    @Override
    public int areFrom(Origin origin) {
        return 0;
    }

    @Override
    public int howManyApplesFromHeavier(Origin origin, int weight) {
        return 0;
    }

    @Override
    public int howManyApples(Predicate<Apple> applePredicate){
        return 0;
    }



}
