package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1002 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double n = 3.14159;
        Double a = Double.parseDouble(br.readLine());

        System.out.printf("A=%.4f\n" , n * (a * a));
    }
}
