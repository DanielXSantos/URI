package session1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1014 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer km = Integer.parseInt(br.readLine());
        Double fuel = Double.parseDouble(br.readLine());

        System.out.printf("%.3f km/l\n" , km / fuel);

    }
}
