package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1016 {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int speed = 60;
            int kilometers = 30;

            Integer distance = Integer.parseInt(br.readLine());

            System.out.printf("%d minutos\n", speed * distance/ kilometers);

        }
}
