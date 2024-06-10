package Lista4;

public class ExeVetor02 {
    public static void main(String[] args) {
        int[] A = new int[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = (i + 1) * 10;
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}
