public class Prog_28 {
    static void sayHello(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        sayHello();
    }

    
}

public class Prog_28 {
    static void printSquare(int n){
        if(n >0){
            System.out.println(n*n);
        }
    }
    public static void main(String[] args) {
        printSquare(4);
        printSquare(5);
    }
}


public class Prog_28 {
    static int multiply(int a, int b){
        if(a>0 & b>0){
        System.out.println("mul"+(a*b));
        }
    }
    public static void main(String[] args) {
    int res = multiply(4, 5b);
    System.out.println(res);
    }
}


public class Prog_28 {
    static boolean isPositive(int n){
        if (n % 2 ==0){
            System.out.println("number is positive"+);
        }
        else{
            System.out.println("number is zero or negative");
        }
    }
        public static void main (String[] args){
            System.out.println(isPositive(4));
    }
}


public class Prog_28 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 11, 14, 20, 7};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 !=0){
            count++;
            }
        }
    System.out.println("Odd num:" + count);
}
}














