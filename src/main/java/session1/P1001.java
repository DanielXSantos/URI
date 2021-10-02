package session1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1001 {

    public static void main(String[] args) throws IOException {

        Integer a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        System.out.printf("X = %d\n", a + b);

    }
}
