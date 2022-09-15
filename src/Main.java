public class Main {
    public static void main(String[] args) {
        int price = 47;
        double salesTax = 0.05;
        double tax = price * salesTax;


        System.out.println("Your total price is " + (price + tax));
    }
}