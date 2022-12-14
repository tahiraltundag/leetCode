package twoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int result[] = new int[2];

        for(int i = 0;i < nums.length;i++){
            int sum = target - nums[i];

            if(map.containsKey(sum)){
                result[0] = map.get(sum);
                result[1] = i;
                return result;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
