/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
     Scanner in = new Scanner(System.in);
     
     String firstName = in.nextLine();
     System.out.print("Name:");
     
     if ((firstName.equals("Alice")) || (firstName.equals("Bob"))){
         System.out.println("Hello " + firstName + "!" );}
         else{
             System.out.println(firstName);
        }
    
     
     
     
     
     
     
    
     

    }
}
