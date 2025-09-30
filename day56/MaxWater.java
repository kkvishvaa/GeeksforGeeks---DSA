// Maximum Water Between Two Buildings
// Given an integer array height[] representing the heights of n buildings, the task is to delete n-2 buildings such that the water that can be trapped between the remaining two building is maximum.
// Note: The total water trapped between two buildings is gap between them (number of buildings removed) multiplied by height of the smaller building.

// Examples:

// Input: height[] = [2,1,3,4,6,5]
// Output: 8
// Explanation: The heights are 2 1 3 4 6 5. So we choose the following buildings 2, 5 and remove others. Now gap between two buildings is equal to 4, and the height of smaller one is 2. So answer is 2 * gap = 2*4 = 8. There is no answer greater than this.
// Input: height[] = [2,1]
// Output: 0
// Explanation: The heights are 2 1.But there is no other buildings to be removed so total removed= 0.Now the height of smaller one is 1.So answer is 1 * removed buildings = 1*0= 0.


public class MaxWater {
    public int maxWater(int[] height) {
        // code here
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxwater=0;
        while(left<right){
            int gap=right-left-1;
            int water=gap*Math.min(height[left],height[right]);
            maxwater=Math.max(maxwater,water);
            if(height[left]<height[right]){
               left++;
            }
            else{
                right--;
            }
          
        }
          return maxwater;
    }
}
