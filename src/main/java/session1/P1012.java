package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        String V[] = line.split(" ");
        Double a = Double.parseDouble(V[0]);
        Double b = Double.parseDouble(V[1]);
        Double c = Double.parseDouble(V[2]);

        System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f\n", (c * c) * 3.14159);
        System.out.printf("TRAPEZIO: %.3f\n", (a + b) * c /(2));
        System.out.printf("QUADRADO: %.3f\n", b *  b);
        System.out.printf("RETANGULO: %.3f\n", a *  b);




    }
}
