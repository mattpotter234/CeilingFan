import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CeilingFan fan = new CeilingFan();
    
        System.out.println("Ceiling Fan Options:\n--------------------");
        System.out.println("Pull a cord.\n1 - Speed\n2 - Direction\n0 - Exit");
    
        boolean exit = false;
    
        while(exit==false){
            try{
                String option = input.nextLine();
        
                switch(option){
                    case "0":
                        exit = true;
                        break;
                    case "1":
                        fan.changeSpeed();
                        break;
                    case "2":
                        fan.changeDirection();
                        break;
                    default:
                        System.out.println("Invalid Input.");
                        break;
                }
                System.out.println(fan.toString());
            } catch(Exception e){
                System.out.println("Input Unavailable.");
                break;
            }
        }
    }
}
