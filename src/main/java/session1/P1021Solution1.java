package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class P1021Solution1 {

    public static Double printNote(Double money, Integer note) {
        Double d = Math.floor(money / note);
        Integer qtd = d.intValue();
        money = money - (qtd * note);
        System.out.printf("%d nota(s) de R$ %d.00\n", qtd, note);
        return money;
    }

    /**
     * Using BigDecimal to avoid lost precision with the double values
     */
    public static Double printCoin(Double money, Double coin) {
        BigDecimal moneyPrecision = new BigDecimal(money);
        Integer qtd = moneyPrecision.divide(BigDecimal.valueOf(coin)).intValue();
        BigDecimal result = moneyPrecision.
                subtract(BigDecimal.valueOf(qtd).multiply(BigDecimal.valueOf(coin)));

        money = result.doubleValue();
        System.out.printf("%d moeda(s) de R$ %.2f\n", qtd, coin);
        return money;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double money = Double.parseDouble(br.readLine());
        Integer notes[] = {100, 50, 20, 10, 5, 2};
        Double coins[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        System.out.println("NOTAS:");
        for (int i = 0; i < notes.length; i++) {
            money = printNote(money, notes[i]);
        }
        System.out.println("MOEDAS:");
        for (int i = 0; i < notes.length; i++) {
            money = printCoin(money, coins[i]);
        }
    }
}

