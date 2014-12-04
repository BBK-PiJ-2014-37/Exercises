package worksheets;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MatchExamples {
    public static void main(String[] args) {
        String[] test1 = {"a", "b", "   "};
        System.out.println("isAnyMissing(test1): " + isAnyMissing(test1));
        String[] test2 = {"a", "b", null};
        System.out.println("isAnyMissing(test2): " + isAnyMissing(test2));
        String[] test3 = {"a", "b", "c"};
        System.out.println("isAnyMissing(test3): " + isAnyMissing(test3));
        List<String> words = Arrays.asList("cat", "house", "Matilda", "water", "arrow", "villains");
        List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
        System.out.println(Arrays.toString(excitingWords.toArray()));
        List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
        System.out.println(Arrays.toString(eyeWords.toArray()));
        List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
        System.out.println(Arrays.toString(upperCaseWords.toArray()));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> powNumbers = ElementUtils.transformedList(numbers, n -> (n*n));
        System.out.println(Arrays.toString(powNumbers.toArray()));
        List<Integer> evenNumbers = ElementUtils.allMatches(numbers, n -> n%2==0);
        System.out.println(Arrays.toString(evenNumbers.toArray()));
        List<Integer> oppositeNumbers = ElementUtils.transformedList(numbers, n -> (-n));
        System.out.println(Arrays.toString(oppositeNumbers.toArray()));       
        
   }

    private static boolean isMissing(String value) {
        return ((value == null) || (value.trim().isEmpty()));
    }

    private static boolean isAnyMissing(String... values) {
        return (Stream.of(values).anyMatch(s -> isMissing(s)));
    }

    private static boolean isAnyMissing2(String... values) {
        return (Stream.of(values).anyMatch(MatchExamples::isMissing));
    }
}
