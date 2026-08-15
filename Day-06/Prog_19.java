public class Prog_19{
    public static int findMin(int[]arr){
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main (String[]args){
        int[] num = {45,77,89,56};
        int res = findMin(num);
        System.out.println("Min " + res);
    }

    }

