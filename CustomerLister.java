import java.util.Scanner;
import java.util.Arrays;
public class CustomerLister {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    String[] customerName = new String[5];
    System.out.println("Please, enter the name: ");

    for (int i = 0; i < customerName.length; i++){      
      customerName[i] = scanner.next();
    }
    System.out.println("You have entered the following names: " + Arrays.toString(customerName));
  }  
}
