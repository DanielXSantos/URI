package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1011 {
    public static void main(String[] args) throws IOException {
        Double pi = 3.14159;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer radius = Integer.parseInt(br.readLine());
        System.out.printf("VOLUME = %.3f\n", ((4/3.0) * pi * (Math.pow(radius,3))));
    }
}
