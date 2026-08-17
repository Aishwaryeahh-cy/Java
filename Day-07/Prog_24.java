public class Prog_24 {

    public static boolean palindrome(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'e', 'i', 'e', 'a'};

        boolean result = palindrome(arr);

        System.out.println(result);
    }
}