package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1040 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String V[] = line.split(" ");
        float a = Float.parseFloat (V[0]);
        float b = Float.parseFloat(V[1]);
        float c = Float.parseFloat(V[2]);
        float d = Float.parseFloat(V[3]);

        float ponderada = 10;
        float media = (a * 2 + b * 3 + c * 4 + d * 1) /ponderada;

        if (media >= 7){
            System.out.printf("Media: %.1f\n" , media);
            System.out.println("Aluno aprovado.");
        }
        if (media < 5){
            System.out.printf("Media: %.1f\n" , media);
            System.out.println("Aluno reprovado.");
        }

        if (media >= 5.0 && media <= 6.9){
            Float nova = Float.parseFloat(br.readLine());
            float exame = (media + nova)/2;
            System.out.println("Media: " + media);
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: " + nova);
            if (exame >= 5.0){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n" , exame);
            }else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final %.1f\n" , exame);
            }
        }

    }
}
