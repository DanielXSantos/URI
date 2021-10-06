package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        List<Double> point1 = Arrays.stream(line.split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        line = br.readLine();
        List<Double> point2 = Arrays.stream(line.split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Double distance = Math.sqrt(Math.pow((point2.get(0) - point1.get(0)), 2) +
        Math.pow(point2.get(1) - point1.get(1), 2));

        System.out.printf("%.4f\n", distance);
    }
}
