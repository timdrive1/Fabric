/**
 * Created by student on 03.05.2017.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    void createVeggies();
    void createPepperoni();
    Clams createClam();
}
