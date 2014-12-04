package worksheets;

public interface Function<OutputType,InputType> {
	OutputType transform(InputType element);
}
