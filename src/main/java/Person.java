import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private List<String> foodPreferences = new ArrayList<>();

    public Person(String ...foodPreferences) {
        this.foodPreferences = Arrays.asList(foodPreferences);
    }


    public List<String> getFoodPreferences() {
        return foodPreferences;
    }

    public String eat(Food food) {

        String foodType = food.getType();

        for (String foodPreference : foodPreferences) {
            if (foodPreference.equalsIgnoreCase(foodType)) {
                return "I like this food.";
            }
        }

        return "I DON'T like this food.";
    }
}
