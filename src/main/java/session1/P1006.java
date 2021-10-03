package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1006 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double a = Double.parseDouble(br.readLine()) * 2;
        Double b = Double.parseDouble(br.readLine()) * 3;
        Double c = Double.parseDouble(br.readLine()) * 5;

        System.out.printf("MEDIA = %.1f\n" , (a + b + c) / 10);



    }

}

