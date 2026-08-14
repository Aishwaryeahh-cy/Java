// 

public class Prog_17{
    static double calculateDiscount(double price,double discountPercent){
        double total =price*discountPercent/100;
        return price-total; 
    }
    public static void main(String[] args) {
        System.out.println(calculateDiscount(35,15));
    }
}