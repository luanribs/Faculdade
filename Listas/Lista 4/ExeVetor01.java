package Lista4;

public class ExeVetor01 {
    public static void main(String[] args) {
        int[] X = new int[10];
        for (int i = 0; i < X.length; i++) {
            X[i] = 30;
        }
        for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
    }
}
