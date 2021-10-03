package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1008 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer b = Integer.parseInt(br.readLine());
        Integer c = Integer.parseInt(br.readLine());
        Double d = Double.parseDouble(br.readLine());

        System.out.println("NUMBER = " + b);
        System.out.printf("SALARY = U$ %.2f\n" ,d * c );



    }
}
