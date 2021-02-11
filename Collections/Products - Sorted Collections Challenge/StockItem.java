public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int qunatityInStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity > 0){
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 21;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this)
            return true;

        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", quantityStock=" + quantityStock;
    }

    @Override
    public int compareTo(StockItem stockItem) {
        System.out.println("Entering compareTO");
        if(this == stockItem){
            return 0;
        }

        if(stockItem != null){
            return this.name.compareTo(stockItem.getName());
        }
        throw new NullPointerException();
    }
}
