import java.util.*;

public class LeetCode2sum{
    public int[] twosums(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int index=0;
        for(int i:nums){
            map.put(i,index);
            index++;
        }
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(map.containsKey(c) && i!=map.get(c)){
                res[0]=i;
                res[1]=map.get(c);
                break; // Add break to exit loop once solution is found
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        LeetCode2sum solution = new LeetCode2sum();
        
        // Input array and target
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Call the twoSum method and print the result
        int[] result = solution.twosums(nums, target);
        System.out.println("Indices of the two numbers that add up to the target: " + Arrays.toString(result));
    }
}
