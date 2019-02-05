/**
 * Created by Francisco Castro on 05Feb2019.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        System.out.print('\u000C');
        String name;
        System.out.println("What's your name?" );
        Scanner input = new Scanner(System.in);
        do{
            name = input.next();
            if( name.equals("Bob") || name.equals("Alice")){
                System.out.print("\nHello " + name + "!");
                break;
            }
            else{
                System.out.print("You are neither a Bob or an Alice, try again!\n");
            }
        } while( true );
    }
    
}
