import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        Object[] arr = Arrays.stream(numbers).mapToObj(String::valueOf)
                        .sorted(((o1, o2) -> (o2 + o1).compareTo(o1 + o2)))
                        .toArray();

        StringBuilder answer = new StringBuilder();
        for (Object s : arr) answer.append(s);

        if (arr[0].equals("0")) return "0";

        return answer.toString();
    }
}