package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1013 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        List<Integer> values = Arrays.stream(line.split(" "))
                           .map(Integer::parseInt)
                           .collect(Collectors.toList());

        Integer maiorAB = (values.get(0) + values.get(1) + Math.abs(values.get(0) - values.get(1))) / 2;
        Integer maiorABC = (maiorAB + values.get(2) + Math.abs(maiorAB - values.get(2))) /2;

        System.out.printf("%d eh o maior\n", maiorABC);
    }
}
