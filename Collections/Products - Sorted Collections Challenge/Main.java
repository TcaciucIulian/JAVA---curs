import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Candy", 0.21, 2000);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.2, 150);
        stockList.addStock(temp);

        temp = new StockItem("Coca-Cola", 1, 60);
        stockList.addStock(temp);

        temp = new StockItem("Fanta", 1, 70);
        stockList.addStock(temp);

        temp = new StockItem("Orange", 2, 20);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s : stockList.Items().keySet()) {
            System.out.print(s + " ");
        }


        Basket myBasket = new Basket("Iulian");
        sellItem(myBasket, "Orange", 1);
        System.out.println(myBasket);

        sellItem(myBasket, "Orange", 2);
        System.out.println(myBasket);

        sellItem(myBasket, "Orange", 1);
        sellItem(myBasket,"Car", 1);
        sellItem(myBasket, "Bread", 1);
        System.out.println(myBasket);
        System.out.println(stockList);

        stockList.Items().get("Orange").adjustStock(40);
        System.out.println(stockList);


        for(Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

}
