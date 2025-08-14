public class swapBits {
    public static int swap(int n) {
    int evenBits=n&0xAAAAAAAA;   //position 1,3,5,7 are 1 masking
    int oddBits=n&0x55555555;     //position 0,2,4,6 are 1 masking
    evenBits>>=1;
    oddBits<<=1;
    return (evenBits|oddBits);
    }
    public static void main(String[] args) {
        int n = 23; 
        int swapped = swap(n);
        System.out.println("Original: " + n);
        System.out.println("Swapped: " + swapped);
    }
}
