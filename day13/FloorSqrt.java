// Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.

// Floor value of any number is the greatest Integer which is less than or equal to that number.

// Examples:

// Input: n = 4
// Output: 2
// Explanation: Since, 4 is a perfect square, so its square root is 2.

public class FloorSqrt {
    int floorSqrt(int n) {
        // code here
        int i;
        for(i=1;i*i<=n;i++){
            if(i*i==n)
            return i;
        }
        return (i-1);
    }
}
    

