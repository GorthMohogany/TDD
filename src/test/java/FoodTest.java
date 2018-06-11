import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    @Test
    public void hasFoodType() {
        Food food = new Food();

        assertEquals("fruit", food.getType());
    }

}