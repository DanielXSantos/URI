package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1009 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double salary ,sales ,total;
        String seller = br.readLine();
        salary = Double.parseDouble(br.readLine());
        sales = Double.parseDouble(br.readLine());

        total = (salary + sales * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n",total);

    }
}
