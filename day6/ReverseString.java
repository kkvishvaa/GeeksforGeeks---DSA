// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        return result;
    }
}


// class Solution {
//     public static String reverseString(String s) {
//         // code here
        
//        return new StringBuilder(s).reverse().toString();
//     }
// }


// class Solution{
//     public static String reverseString(String s){
//         char[] arr=s.toCharArray();
//         int left=0;
//         int right=arr.length-1;
//         while(left<right){
//             char temp=arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;
//             left++;
//             right--;
//         }
//         return new String(arr);
//     }
// }