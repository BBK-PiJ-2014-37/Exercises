package day11;
public class MobilePhone extends OldPhone {
	private RingBuffer lastPhoneCalls;

	public MobilePhone (String brand) {
		super(brand);
		this.lastPhoneCalls = new RingBuffer(10);
	}
	
	void ringAlarm(String time) {
		System.out.println("The alarm has been set at: " + time);
	}

	public void playGame(String game) {
		System.out.println("Playing game: " + game);
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		lastPhoneCalls.add(number);
	}

	public void printLastNumbers() {
		lastPhoneCalls.prettyPrint();
	}

}

class RingBuffer {
	private int length;
	private int start;
	private String buffer[];

	public RingBuffer(int size) {
		buffer = new String[size];
	}

	public void add(String number) {
		if (length < buffer.length) {
			buffer[length] = number;
			length++;
		} else {
			buffer[start] = number;
			start++;
			if (start == buffer.length) {
				start = 0;
			}
		}
	}

	public void prettyPrint(){
		int i = start;
		int n = length;
		while (n > 0) {
			System.out.println(buffer[i]);
			i++;
			if (i == buffer.length) {
				i = 0;
			}
			n--;
		}
	}
}
	