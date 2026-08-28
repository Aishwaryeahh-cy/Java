// public class Prog_27{
//     static void sayHello(){
//         System.out.println("Hello World");
//     }
//     public static void main(String[] args) {
//         sayHello();
//     }
// }


// public class Prog_27{
//     static void square(int n){
//         int sq = n*n;
//         System.out.println(sq);
//     }
//     public static void main(String[] args) {
//         square(3);
//     }
// }

// public class Prog_27{
//     static int multiply(int a, int b){
//         int res=(a*b);
//         return res;
//     }
//     public static void main(String[] args) {
//         System.out.println(multiply(4,5));
        
//     }
// }

// public class Prog_27{
//     static boolean isPositive(int n){
//         if (n %2==0){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPositive(9));
//     }
// }


public class Prog_27{
    public static void main(String[] args) {
        int[] arr = {3, 8, 11, 14, 20, 7};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] %2!= 0 ){
                System.out.println("False");
                count ++;
            }
        }
        System.out.println("Val"+count);
    }
}
