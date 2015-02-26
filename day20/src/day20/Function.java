package day20;

public interface Function<OutputType,InputType> {
	OutputType transform(InputType element);
}
