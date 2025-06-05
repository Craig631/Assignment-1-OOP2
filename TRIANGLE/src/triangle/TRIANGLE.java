/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//By reference variable
package triangle;
import java.util.Scanner;

public class TRIANGLE {
double base, height, ans;
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner BSE = new Scanner (System.in); 
      double base, height,ans;
      TRIANGLE shape=new TRIANGLE(); // Object created
    System.out.println("Enter base=");
    shape.base=BSE.nextDouble();
    System.out.println("Enter height=");
    shape.height=BSE.nextDouble();
    shape.ans=0.5*shape.base*shape.height;
    System.out.printf("Answer=%.2f",shape.ans);
    }

}
    
    

