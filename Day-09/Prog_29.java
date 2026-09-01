// public class Prog_29 {
//     static int square(int n){
//         return (n*n);
//     }
//     public static void main(String[] args) {
//         System.out.println(square(5));
//     }
    
// }

// public class Prog_29 {
//     static int add(int a ,int b){
//         return (a+b);
//     }
//     static int add(int a,int b,int c){
//         return (a+b+c);
//     }
//     public static void main(String[] args) {
//         System.out.println (add(3,5));
//         System.out.println (add(2,4,6));
//     }
// }


// public class Prog_29 {
//     static int findMax(int a ,int b){
//         if(a>b){
//             return a;
//         }
//         else{
//             return b;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(findMax(4,67));
//     }
// }

public class Prog_29{
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int target = 15;
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                index = target;
            }
    }
    System.out.println(index);
}
}


