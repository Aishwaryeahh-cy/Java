jpublic class Prog_23{
    public static int[] twopointers(int[]arr,int target){
        int left = 0;
        int right =arr.length -1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if (sum == target){
                return new int[] {left,right};
            }
            else if (sum<target) {
                left ++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main (String[]args){
        int[]arr = {5,7,8,4,8};
        int target= 14;
        int[] res = twopointers(arr,target);
        System.out.println(res[0]+","+res[1]);
    }
}
