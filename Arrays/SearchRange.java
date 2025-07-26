//Problem:
//Dificulty:
//Approach1:
//Time: O(n) ; Space: O(1)

import java.util.Arrays;

public class SearchRange {
  public static void main(String[] args) {
    int[] nums={3,3,4,5,7,7,7,7,7,8,9,10};
    int[] ans=searchRangeLinear(nums, 4);
    System.out.println(Arrays.toString(ans));
  }

  static int[] searchRangeLinear(int[] nums,int target){
    int[] ans={-1,-1};
    for(int i=0;i<nums.length;i++){
      if(nums[i]==target){
        if(ans[0]==-1){
          ans[0]=i;
          ans[1]=i;
        }
        else{
          ans[1]=i;
        }
      }
    }
    return ans;
  }
  
}
