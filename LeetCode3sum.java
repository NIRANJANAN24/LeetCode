import java.util.*;


public class LeetCode3sum {
    public static void main(String[] args) {
        int[] arr= {0,0,0};
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int cur=arr[i];
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=cur+arr[left]+arr[right];
                if(sum==0){
                    result.add(Arrays.asList(cur, arr[left], arr[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        for(List<Integer> x:result){
            System.out.println(x);
        }

    }
    
}
