package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1036 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String V[] = line.split(" ");
        Double a = Double.parseDouble(V[0]);
        Double b = Double.parseDouble(V[1]);
        Double c = Double.parseDouble(V[2]);


        double formula = b * b -4 * a * c;

        double formula2 = Math.sqrt(formula);

        double r1 = (-b + formula2) / (2*a);
        double r2 = (-b - formula2) / (2*a);

        if (a <= 0 || formula <= 0){
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R2 = %.5f\n",r2);
        }

    }
}
