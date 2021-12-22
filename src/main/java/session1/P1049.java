package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1049 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        if (a.equalsIgnoreCase("vertebrado") && b.equalsIgnoreCase("ave") && c.equalsIgnoreCase("carnivoro")){
            System.out.println("aguia");
        }
        if (a.equalsIgnoreCase("vertebrado") && b.equalsIgnoreCase("ave") && c.equalsIgnoreCase("onivoro")){
            System.out.println("pomba");
        }
        if (a.equalsIgnoreCase("vertebrado") && b.equalsIgnoreCase("mamifero") && c.equalsIgnoreCase("onivoro")){
            System.out.println("homem");
        }
        if (a.equalsIgnoreCase("vertebrado") && b.equalsIgnoreCase("mamifero") && c.equalsIgnoreCase("herbivoro")){
            System.out.println("vaca");
        }

        if (a.equalsIgnoreCase("invertebrado") && b.equalsIgnoreCase("inseto") && c.equalsIgnoreCase("hematofago")){
            System.out.println("pulga");
        }
        if (a.equalsIgnoreCase("invertebrado") && b.equalsIgnoreCase("inseto") && c.equalsIgnoreCase("herbivoro")){
            System.out.println("lagarta");
        }
        if (a.equalsIgnoreCase("invertebrado") && b.equalsIgnoreCase("anelideo") && c.equalsIgnoreCase("hematofago")){
            System.out.println("sanguessuga");
        }
        if (a.equalsIgnoreCase("invertebrado") && b.equalsIgnoreCase("anelideo") && c.equalsIgnoreCase("onivoro")){
            System.out.println("minhoca");
        }

    }
}
