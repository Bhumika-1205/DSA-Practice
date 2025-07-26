//Problem: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//Dificulty: Medium
//Approach1: Linear Search
//Time: O(n) ; Space: O(1)
//Approach2: Binary Search
//Time: O(logn) ; Space: O(1)


import java.util.Arrays;

public class SearchRange {
  public static void main(String[] args) {
    int[] nums={3,3,4,5,7,7,7,7,7,8,9,10};
    int[] ansLinear=searchRangeLinear(nums, 7);
    System.out.println(Arrays.toString(ansLinear));

    int[] ansBinary=searchRangeBinary(nums, 7);
    System.out.println(Arrays.toString(ansBinary));
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

  static int[] searchRangeBinary(int[] nums,int target){
        int[] ans={-1,-1};
        ans[0]=binarySearch(nums,target,true);
        if (ans[0]!=-1){
            ans[1]=binarySearch(nums,target,false);
        }
        return ans;
  }
  static int binarySearch(int[] nums,int target,boolean atStart){
        int low=0,high= nums.length,ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                if(atStart){
                    high=mid-1;
                }else{low=mid+1;}
            } else if (nums[mid]<target) {
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return ans;
    }
  
}
