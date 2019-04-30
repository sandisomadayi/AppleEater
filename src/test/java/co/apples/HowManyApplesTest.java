package co.apples;

import org.junit.jupiter.api.Test;

import static co.apples.Apples.apples;
import static org.junit.jupiter.api.Assertions.assertEquals;
import co.apples.Apples;

public class HowManyApplesTest {

    @Test
    void shoudFindAllTheRedApples() {
        HowManyApples howManyApples = new HowManyApples(apples);

        assertEquals(11, howManyApples.areRed());
    }

    @Test
    void shouldFindAllFromArgentina() {
        HowManyApples howManyApples = new HowManyApples(apples);

        assertEquals(3, howManyApples.areFromArgentina());
    }

    @Test
    void shouldFindFromChinaHeavierThan110() {
        HowManyApples howManyApples = new HowManyApples(apples);

        assertEquals(2, howManyApples.howManyAppleFromChinaHeavier110g());
    }

    @Test
    void shouldFindFromSpecificRegion() {
        HowManyApples howManyApples = new HowManyApples(apples);

        assertEquals(5, howManyApples.areFrom(Origin.SouthAfrica));
    }

    @Test
    void shouldFindWeightFromSpecificRegion() {
        HowManyApples howManyApples = new HowManyApples(apples);

        assertEquals(1, howManyApples.howManyApplesFromHeavier(Origin.SouthAfrica, 85));
    }
}
