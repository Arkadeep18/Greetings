import java.util.*;

public class Prac4Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Button");
        int Button = sc.nextInt();
        
        //if we select 1 it'll show "Hello", for 2 it shows "Namaste" and so on
        
        switch(Button) {
        case 1: System.out.println("Hello");
        break;
        case 2: System.out.println("Namaste");
        break;
        case 3: System.out.println("Bonjour");
        break;
        default: System.out.println("Invalid Input");
        
        
        }
    
    }
}
