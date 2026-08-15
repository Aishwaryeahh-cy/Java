public class Prog_20 {
    public static double findMax(double[]arr){
        double max = arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];

            }
        }
        return max;

    }
    public static void main (String[]args){
        double[]num = {45.888,90.888,90909090};
        double res = findMax(num);
        System.out.println("Maxxx " + res);
    }
    

    
}
