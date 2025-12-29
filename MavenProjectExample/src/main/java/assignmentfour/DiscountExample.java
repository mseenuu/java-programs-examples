package assignmentfour;

public class DiscountExample {

    
    static double calculateTotal(double item1, double item2, double item3) {
        return item1 + item2 + item3;
    }

   
    static double checkDiscount(double total) {
        if (total > 5000) {
            return total * 0.80;   // 20% discount
        } else {
            return total;
        }
    }

    public static void main(String[] args) {

        
        double price1 = 2000;
        double price2 = 1800;
        double price3 = 1500;

        
        double totalAmount = calculateTotal(price1, price2, price3);        
        double finalAmount = checkDiscount(totalAmount);

        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Final Amount after discount: " + finalAmount);
    }
}

