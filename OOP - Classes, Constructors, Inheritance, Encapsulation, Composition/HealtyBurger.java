public class HealtyBurger extends Hamburger{
    private String healtyExtra1Name;
    private double healtyExtra1Price;

    private String healtyExtra2Name;
    private double healtyExtra2Price;

    public HealtyBurger(String meat, double price) {
        super("Healthy BURGER", meat, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healtyExtra1Name = name;
        this.healtyExtra1Price = price;
    }
    public void addHealthAddition2(String name, double price){
        this.healtyExtra2Name = name;
        this.healtyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();
        if(healtyExtra1Name != null){
            hamburgerPrice += this.healtyExtra1Price;
            System.out.println("Added" + this.healtyExtra1Name + "for extra " + this.healtyExtra1Price);
        }
        if(healtyExtra2Name != null){
            hamburgerPrice += this.healtyExtra2Price;
            System.out.println("Added" + this.healtyExtra2Name + "for extra " + this.healtyExtra2Price);
        }

        return hamburgerPrice;
    }
}
