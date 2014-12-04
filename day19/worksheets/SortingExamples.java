package worksheets;

import java.util.Arrays;

import worksheets.ArrayUtils;

public class SortingExamples {
    public static void main(String[] args) {
        String[] words = {"hi", "hello", "hola", "bye", "goodbye", "adios"};
        System.out.print("Original array: ");
        ArrayUtils.printArray(words);
        Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
        System.out.print("Sorted by length ascending: ");
        ArrayUtils.printArray(words);
        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
        System.out.print("Sorted by length descending : ");
        ArrayUtils.printArray(words);
        Arrays.sort(words, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        System.out.print("Sorted by first letter : ");
        ArrayUtils.printArray(words);
        Arrays.sort(words, (s1, s2) ->
        {
            int compareFlag = 0;
            if (s1.contains("e") && !s2.contains("e")) {
                compareFlag = -1;
            } else if (s2.contains("e") && !s1.contains("e")) {
                compareFlag = 1;
            }
            return (compareFlag);
        });
        System.out.print("Sorted by whether it contains 'e' [v1] : ");
        ArrayUtils.printArray(words);
        Arrays.sort(words, StringUtils::eChecker);
        System.out.print("Sorted by whether it contains 'e' [v2] : ");
        ArrayUtils.printArray(words);
    }
}
