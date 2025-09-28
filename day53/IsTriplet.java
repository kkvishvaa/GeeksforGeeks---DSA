import java.util.Arrays;
public class IsTriplet {

    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            if(isPair(arr,target-arr[i],i+1,n-1)){
                return true;
            }
        }
        return false;
        
    }
    public boolean isPair(int[] arr,int x,int i,int j){
        while(i<j){
        if(arr[i]+arr[j]==x){
            return true;
        }
        else if(arr[i]+arr[j]<x){
            i++;
        }
        else{
            j--;
        }
    }
    return false;
    }
}

//Sorting: O(n log n)  
//Overall;
//Time Complexity: O(n²)

//Space Complexity: O(1)
