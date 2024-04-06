package swiggy;

import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    public List<Dish> dishes(Dish dish){
        Restaurant restaurant = new Restaurant();

        Dish dish1 = new Dish();
        dish1.type="Biryani";
        dish1.price="300";
        dish1.rating="5";
        dish1.restaurant=restaurant;

        Dish dish2 = new Dish();
        dish2.type="noodles";
        dish2.restaurant=restaurant;
        dish2.price="200";
        dish2.rating="3.5";


        List<Dish> dishList = new ArrayList<>();
        dishList.add(dish1);
        dishList.add(dish2);





        return dishList;
    }
}
