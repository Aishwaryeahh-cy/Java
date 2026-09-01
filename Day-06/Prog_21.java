public class Prog_21{
    static int linearSearch(int[]arr,int target){
        for(int i=0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={67,90,77,8,9,97};
        System.out.println(linearSearch(arr,90));
        System.out.println(linearSearch(arr,89));
    
}
