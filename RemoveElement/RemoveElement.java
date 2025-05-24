package RemoveElement;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        
        RemoveElement removeElement = new RemoveElement();
        int k = removeElement.removeElement(nums, val);
        System.out.println("The length of the array after removing the element is: " + k);
        System.out.print("The modified array is: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
