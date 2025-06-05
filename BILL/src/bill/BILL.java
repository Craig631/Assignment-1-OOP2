//By reference variable
package bill;
import java.util.Scanner;

public class BILL {
    double units, standingcharge, total;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner BSE = new Scanner(System.in);
        BILL client = new BILL();//Object Created
        System.out.println("Enter units consumed=");
        client.units=BSE.nextDouble();
         System.out.println("Enter standingcharge=");
         client.standingcharge=BSE.nextDouble();
         client.total=client.units*55 + client.standingcharge;
         System.out.printf("Amount payable=%.2f",client.total);
    }
    
}
