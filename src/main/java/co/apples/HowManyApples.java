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
        int counter = 0;
        for (Apple apple : apples) {
            if(apple.getOrigin() == Origin.Argentina) {
                counter++;
            }
//            apple.getOrigin() == "Argentina";
        }
        return counter;
    }

    @Override
    public int areRed() {
        int counter = 0;
        for (Apple apple : apples){
            if (apple.getColor() == Color.Red){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public int howManyAppleFromChinaHeavier110g() {
        int counter = 0;

        for (Apple apple : apples) {
            if (apple.getOrigin() == Origin.China && apple.getWeight() > 110) {
                counter++;
            }
        }
        return counter;
    }


    @Override
    public int areFrom(Origin origin) {
        int counter = 0;
        for (Apple apple : apples){
            if(apple.getOrigin() == origin) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public int howManyApplesFromHeavier(Origin origin, int weight) {
        int counter = 0;

        for (Apple apple : apples) {
            if(apple.getOrigin() == origin && apple.getWeight() > weight) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public int howManyApples(Predicate<Apple> applePredicate){

        return 0;
    }



}
