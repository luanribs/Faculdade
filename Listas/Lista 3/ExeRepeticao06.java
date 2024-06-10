package lista3;

public class ExeRepeticao06 {
    public static void main(String[] args) {
        int count = 0;
        int x = 101;

        while (count < 50) {
            int dv = 0;
/* perguntar na aula como se usa Math direito porque foi a unica maneira que achei de fazer sem ser boolean*/
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    dv++;
                    break;
                }
            }

            if (dv == 0) {
                System.out.println(x);
                count++;
            }

            x++;
        }
    }
}
