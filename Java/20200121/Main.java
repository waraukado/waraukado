import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // streamを使った平均算出例
        List<String> numbers = Arrays.asList("12", "34", "60", "28", "35", "93", "21", "3", "91", "76", "20");
        double avg = numbers.stream()
                    .mapToInt(Integer::parseInt)
                    .average()
                    .getAsDouble();
        System.out.println(avg);
    }
}