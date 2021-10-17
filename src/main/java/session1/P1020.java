package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1020 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int daysInYear = Integer.parseInt(br.readLine());

        int years = daysInYear / 365;
        int month = (daysInYear % 365) / 30;
        int days =( daysInYear % 365) % 30;

        System.out.println(years + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(days + " dia(s)");

    }
}
