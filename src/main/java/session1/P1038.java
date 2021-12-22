package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1038 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String V[] = line.split(" ");
        Integer a = Integer.parseInt(V[0]);
        Integer b = Integer.parseInt(V[1]);

        if (a == 1){
            System.out.printf("Total: R$ %.2f\n" , 4.0 * b);
        }if (a == 2){
            System.out.printf("Total: R$ %.2f\n" , 4.50 * b);
        }if (a == 3){
            System.out.printf("Total: R$ %.2f\n" , 5.0 * b);
        }if (a == 4){
            System.out.printf("Total: R$ %.2f\n" , 2.0 * b);
        }if (a == 5){
            System.out.printf("Total: R$ %.2f\n" , 1.50 * b);
        }

    }
}
