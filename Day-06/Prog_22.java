public class Prog_22 {
    public static void main(String[] args) {
        int[] num ={90,7,8,4,6};
        int sum =0;
        for (int i=0; i<num.length; i++){
            sum = sum+num[i];
        }
        int average=(int)sum/num.length;
        System.out.println("Sum"+sum);
        System.out.println("Average"+average);
    }
    
}
