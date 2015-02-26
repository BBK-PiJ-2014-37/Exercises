package day20;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ArrayChanger {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("cat", "beh", "house", "Matilda",
				"water", "arrow", "villains", "no");
		// 1
		words.stream().forEach(s -> System.out.println("  " + s));
		// 2
		words.stream().forEach(System.out::println);
		// 3
		words.stream().map(s -> s + "!").forEach(System.out::println);
		words.stream().map(s -> s.replace("i", "eye"))
				.forEach(System.out::println);
		words.stream().map(String::toUpperCase).forEach(System.out::println);
		// 4
		words.stream().filter(s -> s.contains("b"))
				.forEach(System.out::println);
		// words.stream().filter(String :: contains
		// ("b")).forEach(System.out::println);??
		words.stream().filter(s -> s.length() < 4).forEach(System.out::println);
		words.stream().filter(s -> s.length() % 2 == 0)
				.forEach(System.out::println);
		// 5
		String firstShortWithE = words.stream().map(String::toUpperCase)
				.filter(s -> s.length() < 4).filter(s -> s.contains("e"))
				.findFirst().toString();
		System.out.println(firstShortWithE);// ???
		// 6

		// 7
		String oneUpperCase = words.stream().reduce("",
				(s1, s2) -> s1.toUpperCase() + s2.toUpperCase());
		System.out.println(oneUpperCase);
		//8
		String oneUpperCase1 = words.stream().map(String::toUpperCase)
				.reduce("",(s1, s2) -> s1 + s2);
		System.out.println(oneUpperCase1);
		//9
		Optional <String> oneWithCommas = words.stream().reduce((s1,s2) -> s1 + "," + s2);
		System.out.println(oneWithCommas);
		
	}

		
}
