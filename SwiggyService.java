package swiggy;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {

public List<Restaurant> searchRestaurant(Restaurant restaurant){


    Address restaurantAddress = new Address();
    restaurantAddress.area="miyapur";
    restaurantAddress.pinCode="500049";


    Address restaurantAddress1 = new Address();
    restaurantAddress1.area="kphb";
    restaurantAddress1.pinCode="500085";



    Dish dish1 = new Dish();
    dish1.type="veg Biryani";
    dish1.price="300";
    dish1.rating="5";
    dish1.restaurant=restaurant;

    Dish dish2 = new Dish();
    dish2.type="chicken biryani";
    dish2.restaurant=restaurant;
    dish2.price="200";
    dish2.rating="3.5";

    Dish dish3 = new Dish();
    dish3.type="mutton biryani";
    dish3.restaurant=restaurant;
    dish3.price="200";
    dish3.rating="3.5";

    Dish dish4 = new Dish();
    dish4.type="chicken noodles";
    dish4.restaurant=restaurant;
    dish4.price="200";
    dish4.rating="3.5";

    Dish dish5 = new Dish();
    dish5.type="chicken hakka noodles";
    dish5.restaurant=restaurant;
    dish5.price="200";
    dish5.rating="3.5";

    Dish dish6 = new Dish();
    dish6.type="double egg noodles";
    dish6.restaurant=restaurant;
    dish6.price="200";
    dish6.rating="3.5";

    List<Dish> dishList = new ArrayList<>();
    dishList.add(dish1);
    dishList.add(dish2);
    dishList.add(dish3);
    restaurant.dishesList=dishList;

    List<Dish> dishList1 = new ArrayList<>();
    dishList.add(dish4);
    dishList.add(dish5);
    dishList.add(dish6);
    restaurant.dishesList=dishList1;

    Restaurant indianRestaurant = new Restaurant();
    indianRestaurant.name="jhulla dhaba";
    indianRestaurant.address=restaurantAddress;
    indianRestaurant.rating="5";
    indianRestaurant.dishesList=dishList;


    Restaurant chinees = new Restaurant();
    chinees.name="Dine o china";
    chinees.address=restaurantAddress1;
    chinees.dishesList=dishList1;
    chinees.rating="3.5";

    List<Restaurant> restaurantList = new ArrayList<>();
    restaurantList.add(indianRestaurant);
    restaurantList.add(chinees);






    return restaurantList;
    }
}
