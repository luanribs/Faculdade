package Lista4;

public class ExeVetor03 {
    public static void main(String[] args) {
        int[] B = new int[10];
        for (int i = 0; i < B.length; i++) {
            if (i % 2 == 0) {
                B[i] = 20;
            } else {
                B[i] = 10;
            }
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
