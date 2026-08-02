public class Main {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        int[] nums = {1, 1, 2, 2, 3};

        int k = obj.removeDuplicates(nums);

        System.out.println("Unique elements: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
