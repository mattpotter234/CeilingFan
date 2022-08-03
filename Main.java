import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CeilingFan fan = new CeilingFan();
    
        System.out.println("Ceiling Fan Options:\n--------------------");
        System.out.println("Pull a cord.\n1 - Speed\n2 - Direction\n0 - Exit");
    
        boolean exit = false;
    
        try{
            while(!exit){
                String option = input.nextLine();
        
                switch(option){
                    case "0":
                        exit = true;
                        break;
                    case "1":
                        fan.changeSpeed();
                        System.out.println(fan.toString());
                        break;
                    case "2":
                        fan.changeDirection();
                        System.out.println(fan.toString());
                        break;
                    default:
                        System.out.println("Invalid Input.");
                        break;
                }
            }
        } catch(Exception e){
            System.out.println("Input Unavailable.");
        }
    }
}
