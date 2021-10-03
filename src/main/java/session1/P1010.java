package session1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1010 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String V[] = line.split(" ");
        Integer c1 = Integer.parseInt(V[0]);
        Integer n1 = Integer.parseInt(V[1]);
        Double v1 = Double.parseDouble(V[2]);

        line  = br.readLine();
        V = line.split(" ");
        Integer c2 = Integer.parseInt(V[0]);
        Integer n2 = Integer.parseInt(V[1]);
        Double v2 = Double.parseDouble(V[2]);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (n1 * v1) + (n2 * v2));



    }


}
