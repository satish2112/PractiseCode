public class RemoveElementFromArray {
    public static int removeElement(int[] nums, int val) {
        int write = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[write] = nums[i];
                write++;
            }
        }
        return write;
    }

    public static void main(String[] args) {
        int[] num = {1, 3, 4, 5, 6, 5};
        System.out.println(removeElement(num,5));
    }
}
