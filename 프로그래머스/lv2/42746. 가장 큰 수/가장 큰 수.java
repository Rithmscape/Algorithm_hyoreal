import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String[] arr =
                Arrays.copyOf(
                        Arrays.stream(numbers).mapToObj(String::valueOf)
                                .sorted(((o1, o2) -> (o2 + o1).compareTo(o1 + o2)))
                                .toArray()
                        , numbers.length, String[].class);

        StringBuilder answer = new StringBuilder();
        for (String s : arr) answer.append(s);

        if (arr[0].equals("0")) return "0";

        return answer.toString();
    }
}