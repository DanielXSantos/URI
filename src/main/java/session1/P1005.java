package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double a = Double.parseDouble(br.readLine());
        Double b = Double.parseDouble(br.readLine());

        System.out.printf("MEDIA = %.5f\n", ((a *3.5) + (b*7.5)) / (3.5 + 7.5));
    }

}
