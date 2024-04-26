package Decorator;

public class Main {

    public static void main(String[] args){
        Order order = new Order();
        
        Drink drink = new Drink();
        MainMeal mainMeal = new MainMeal();
        Soup soup = new Soup();

        drink.decorate(order);
        mainMeal.decorate(drink);
        soup.decorate(mainMeal);
        soup.show();
    }
}
