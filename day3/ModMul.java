public class ModMul {
    public int modmul(int a, int b, int M) {
        return (int)(((1L*a)*b)%M);
    }
    public static void main(String[] args) {
        ModMul modMul = new ModMul();
        System.out.println(modMul.modmul(1000000000, 1000000000, 1000000007)); // Example usage
    }
}