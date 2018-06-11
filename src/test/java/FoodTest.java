import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    @Test
    public void hasFoodType() {
        Food apple = new Food("fruit");
        Food pizza = new Food("pizza");

        assertEquals("fruit", apple.getType());
        assertEquals("pizza", pizza.getType());
    }

}