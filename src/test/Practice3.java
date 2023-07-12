package test;

public class Practice3 {
	
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		System.out.println(deleteElement(nums, val));
		for (int i : nums) {
			System.out.println(i);
		}
	}

	static int deleteElement(int[] nums, int val) {
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		
		return count;
}



//	public static void main(String[] args) {
//		
//        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int val = 2;
//        
//        int newLength = deleteElement(nums, val);
//        
//        System.out.println(newLength);
//        for (int i = 0; i < newLength; i++) {
//            System.out.println(nums[i]);
//        }
//    }
//    
//    public static int deleteElement(int[] nums, int val) {
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return j;
//    }


}
