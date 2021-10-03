package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(br.readLine());
        Integer b = Integer.parseInt(br.readLine());

        System.out.printf("SOMA = %d\n", a +b);
    }

}
