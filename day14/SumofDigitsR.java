public class SumofDigitsR {
    
    public static int sumOfDigits(int n) {
        // Code here
        if(n==0)
        return n;
        return (n%10)+sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}

