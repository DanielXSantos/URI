package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1042 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String V[] = line.split(" ");
        Integer a = Integer.parseInt(V[0]);
        Integer b = Integer.parseInt(V[1]);
        Integer c = Integer.parseInt(V[2]);

        int um = 0;
        int dois =0;
        int tres =0;

        if (a > b && a > c && b > c){
            um = c;
            dois = b;
            tres = a;
        }
        if (a > b && a > c && c > b){
            um = b;
            dois = c;
            tres = a;
        }
        if (b > a && b > c && a > c){
            um = c;
            dois = a;
            tres = b;
        }
        if (b > a && b > c && c > a){
            um = a;
            dois = c;
            tres = b;
        }
        if (c > a && c > b && a > b){
            um = b;
            dois = a;
            tres = c;
        }
        if (c > a && c > b && b > a){
            um = a;
            dois = b;
            tres = c;
        }

        System.out.println(um);
        System.out.println(dois);
        System.out.println(tres);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
