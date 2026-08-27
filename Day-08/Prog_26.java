// public class Prog_26 {
//     public static void main(String[] args) {
//         int arr[]={5,10,15,20,25};
//         for(int i=0;i <arr.length; i++){
//             System.out.println(arr[i]);
//     }
// }
// }

// public class Prog_26 {
//     public static void main(String[] args){
//         int []arr = {10,20,30};
//         arr[1] =200;
//         System.out.println(arr[1]);
//     }
// }

// public class Prog_26{
//     public static void main(String[] args) {
//         int[] arr = {4,9,2,7,5};
//         int target=7;
//         for(int i=0; i<arr.length; i++){
//             if (arr[i]== target){
//             target = arr[i];}
//         }
//         System.out.println(target);
// }
// }

// public class Prog_26{
//     public static void main(String[] args){
//         int [] arr={4,9,2,7,5};
//         int target =11;
//         for(int i=0; i<arr.length; i++){
//             if (arr[i]==target){
//                 target =arr[i];
//             }
//         }
//         System.out.println(target);
//     }
// }

public class Prog_26{
    public static void main(String[] args) {
        int[]arr = {20,32,33,45};
        int target = 32;
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                index = i;
            }
        }
        System.out.println(index);
    }
}





