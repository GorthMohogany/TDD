import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void hasFoodPreferences() {
        Person jim = new Person();
        Person jon = new Person("fruit");

        assertTrue(jim.getFoodPreferences().isEmpty());
        assertEquals("fruit", jon.getFoodPreferences().get(0));
    }

    @Test
    public void canEatFood() {
        Person jon = new Person("fruit");
        Person jim = new Person("pizza");

        Food fruit = new Food("fruit");

        assertEquals("I like this food.", jon.eat(fruit));
        assertEquals("I DON'T like this food.", jim.eat(fruit));
    }
}