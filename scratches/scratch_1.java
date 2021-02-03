interface Pizza {
    public static final String shape = "Circle";
    public abstract void addToppings();
}
abstract class CheesePizza implements Pizza {
    @Override
    public void addToppings() {
        System.out.println("Cheese Topping");
    }
}
abstract class TomatoPizza implements Pizza {
    @Override
    public void addToppings() {
        System.out.println("Tomato Topping");
    }
}
class Margereta implements Pizza {
    @Override
    public void addToppings() {
        System.out.println("Margereta Toppings");
    }
}

class Deliver extends TomatoPizza {

}

class Main {
    public static void main(String[] args) {
        Deliver deliver = new Deliver();
        deliver.addToppings();
    }
}