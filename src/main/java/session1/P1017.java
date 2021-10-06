package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1017 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tempo, vm;
        double dp;

        tempo = Integer.parseInt(br.readLine());
        vm = Integer.parseInt(br.readLine());

        dp = vm * tempo;

        System.out.printf("%.3f\n", dp/12);
    }
}
