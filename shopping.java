import java.util.Scanner;
public class shopping {

    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);

     String item;

     double price;
     int quantity;
     char currency = '$';
     double total;

     System.out.print("What item you would like to buy:");
     item = scanner.nextLine();

     System.out.println("What is the price for each?");
     price = scanner.nextDouble();

     

     System.out.println("How many would you like:");
     quantity = scanner.nextInt();

     total = price * quantity;

     System.out.println("total bill: " +total );



     






     scanner.close();
    }
}