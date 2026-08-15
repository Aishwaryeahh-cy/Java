import java.util.Scanner;
public class Prog_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Traffic Colour (Red,Yellow,Green):");
        String colour = sc.nextLine();
        switch (colour){
            case  "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Alret");
                break;
            case "Green":
                System.out.println("Gooo");
                break;
        }
    
    }
}