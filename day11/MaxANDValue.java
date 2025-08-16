class MaxANDValue {
    public int maxAND(List<Integer> arr) {
        // code here
        int res=0;
        for(int i=31;i>=0;i--){
            int temp=res|(1<<i);
            int count=0;
    
            for(int num:arr){
                if ((temp&num)==temp){
                    count++;
                }
                if(count>=2)
                break;
            }
            if(count>=2)
            res=temp;
        }
        return res;
    }
}







// public class MaxANDValue {

//     public int maxAND(List<Integer> arr) {
//         // code here
//         int max=0;
//         int current=0;
//         for(int i=0;i<arr.size();i++){
//             for(int j=i+1;j<arr.size();j++){
//                 current=arr.get(i)&arr.get(j);
//                 max=Math.max(max,current);
//             }
//         }
//         return max;
//     }
// }



