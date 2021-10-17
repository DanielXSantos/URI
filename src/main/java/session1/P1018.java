package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer money = Integer.parseInt(br.readLine());

        System.out.println(money);
        int result = (money / 100);
        System.out.println(result + " nota(s) de R$ 100,00");
        money = money - (result * 100);

        result = (money / 50);
        System.out.println(result + " nota(s) de R$ 50,00");
        money = money - (result * 50);

        result = (money / 20);
        System.out.println(result + " nota(s) de R$ 20,00");
        money = money - (result * 20);

        result = (money / 10);
        System.out.println(result + " nota(s) de R$ 10,00");
        money = money - (result * 10);

        result = (money / 5);
        System.out.println(result + " nota(s) de R$ 5,00");
        money = money - (result * 5);

        result = (money / 2);
        System.out.println(result + " nota(s) de R$ 2,00");
        money = money - (result * 2);

        result = (money / 1);
        System.out.println(result + " nota(s) de R$ 1,00");
        money = money - (result * 1);


    }
}
