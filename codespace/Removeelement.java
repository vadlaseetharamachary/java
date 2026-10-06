import java.util.Arrays;

public class Removeelement {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index; 
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;

        int newLength = removeElement(nums, val);
        System.out.println("Number of elements remaining: " + newLength);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}