package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1037 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double intervalo = Double.parseDouble(br.readLine());


        if(intervalo >= 0 && intervalo <=25.0){
            System.out.println("Intervalo [0,25]");
        }
        if(intervalo > 25.0 && intervalo <=50){
            System.out.println("Intervalo (25,50]");
        }
        if (intervalo > 50 && intervalo <=75){
            System.out.println("Intervalo (50,75]");
        }
        if (intervalo > 75 && intervalo <=100){
            System.out.println("Intervalo (75,100]");
        }
        if(intervalo < 0 || intervalo > 100){
            System.out.println("Fora de intervalo");
        }



    }
}
