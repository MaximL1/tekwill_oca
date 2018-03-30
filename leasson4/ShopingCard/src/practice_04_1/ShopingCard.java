package practice_04_1;

public class ShopingCard {
    public static void main(String[] args){
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message;

        double price=100,tax = 2.5;
        double total;
        int quantity = 3;
        total =price*quantity*tax;
        message =custName + " wants to purchase " + quantity + " "+itemDesc;
        System.out.println(message);
        System.out.println("Total cost with tax is:"+total);
    }
}
