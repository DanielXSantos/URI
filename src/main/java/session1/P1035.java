package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1035 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        String V[] = line.split(" ");
        Integer a = Integer.parseInt(V[0]);
        Integer b = Integer.parseInt(V[1]);
        Integer c = Integer.parseInt(V[2]);
        Integer d = Integer.parseInt(V[3]);

        if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0 ){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}
