import java.util.Scanner;
public class Prog_10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();
        if (num%2 ==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

}