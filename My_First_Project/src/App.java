import java.util.Scanner;
import com.newProject.firstPackage.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        Math m = new Math();
        
        m.printData();
    }
}
