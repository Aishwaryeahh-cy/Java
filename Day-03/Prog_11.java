import java.util.Scanner;
public class Prog_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur marks:");
        int num = sc.nextInt();
        if (num >= 300){
            System.out.println("Extremely good");
        }
        else if (num >= 100){
            System.out.println("Good");
        }
        else if (num >= 80){
            System.out.println("Okayish");
        }else{
            System.out.println("Failed");
        }

    }
    
}
