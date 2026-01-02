package dailypractice.LeetCode.year25.march;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        for (int i = n; i>=0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else {
                digits[i] =0;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

    }

    public static void main(String[] args) {
        int[] a= {1,2,9};
        int[] r = plusOne(a);
        for (int num : r){
            System.out.print(num + " ");
        }

    }
}
