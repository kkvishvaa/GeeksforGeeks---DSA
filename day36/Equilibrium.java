public class Equilibrium {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            res+=arr[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
            res-=arr[i];
            if(left==res){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}


