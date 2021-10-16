package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1019 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer seconds = Integer.parseInt(br.readLine());
        Integer hours = Math.round(seconds / 3600);
        seconds = seconds - (3600 * hours);
        Integer minutes = Math.round(seconds / 60);
        seconds = seconds - (60 * minutes);
        System.out.printf("%d:%d:%d\n", hours,minutes,seconds);
    }
}
