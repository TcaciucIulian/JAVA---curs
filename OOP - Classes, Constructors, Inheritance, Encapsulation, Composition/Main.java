public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 10, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.5);
        hamburger.addHamburgerAddition2("Bacon", 2);
        hamburger.addHamburgerAddition3("Chedar", 3);
        price = hamburger.itemizeHamburger();
        System.out.println("Total price : " + price);

        HealtyBurger healtyBurger = new HealtyBurger("Bacon", 13);
        healtyBurger.addHamburgerAddition1("Egg", 4);
        healtyBurger.addHealthAddition1("Tuna", 7);
        System.out.println("Total price for Healthy Burger is : " + healtyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("More chiiiiips", 10);
        System.out.println("Total price for Deluxe Burger is : " + deluxeBurger.itemizeHamburger());
    }
}
