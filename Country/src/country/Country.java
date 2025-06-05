package country;
import java.util.Scanner;
/**
 *
 * @author dizne
 */
public class Country {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Country = new Scanner(System.in);
System.out.print("Enter Country code=");
char code=Country.next().charAt(0);
switch(code)
{
    case 'K':
    case 'k':System.out.println("Kenya-Highly talented sportsmen");
             break;
    case 'I':
    case 'i':System.out.println("India-Sporting affected by their culture");
             break;
    case 'U':
    case 'u':System.out.println("United States-Good in short races");
             break;
    case 'N':
    case 'n':System.out.println("Nigeria-Give a good attempt in short races");
             break;
    default:System.out.println("All other Countries-General performance is low");

    }
   }
}
