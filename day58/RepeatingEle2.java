// import java.util.*;
// import java.io.*;
// import java.lang.*;



// class GFG 
// { 

// 	static int repeat(int arr[], int n)
// 	{
// 		int slow = arr[0], fast = arr[0];

// 		do{
// 			slow = arr[slow];
// 			fast = arr[arr[fast]];
		
// 		}while(slow != fast);
		
// 		slow = arr[0];

// 		while(slow != fast)
// 		{
// 			slow = arr[slow];
// 			fast = arr[fast];
// 		}
// 		return slow;
// 	}

// 	public static void main(String args[]) 
//     {

// 		int arr[] = {1, 3, 2, 4, 6, 5, 7, 3}, n= 8;

//         System.out.println(repeat(arr, n));

//     } 

// }



import java.util.*;
import java.io.*;
import java.lang.*;



class GFG 
{ 

	static int repeat(int arr[], int n)
	{
		int slow = arr[0]+1, fast = arr[0]+1;

		do{
			slow = arr[slow]+1;
			fast = arr[arr[fast]+1]+1;
		
		}while(slow != fast);
		
		slow = arr[0]+1;

		while(slow != fast)
		{
			slow = arr[slow]+1;
			fast = arr[fast]+1;
		}
		return slow-1;
	}

	public static void main(String args[]) 
    {

		int arr[] = {0,2,1,3,5,4,6,2}, n= 8;

        System.out.println(repeat(arr, n));

    } 

}