package day14;
import java.util.*;
import java.lang.Math;

public class Hailstone {
	private List<Integer> sequence;

	public List<Integer> getSequence(int input) {
		if(input%2 == 0) {
			sequence.add(input/2);
			getSequence(sequence.get(sequence.size()-1));
		} else {
			sequence.add((3*input)+1);
			getSequence(sequence.get(sequence.size()-1));
		}
	}

	public static void main (String[] args){
		String input = System.console().readLine();
		int inputNumber = Integer.parseInt(input);
		System.out.println(Hailstone.getSequence(inputNumber));

	}
}