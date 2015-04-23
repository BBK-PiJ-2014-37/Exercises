package day10;

public class MusicalInstrument{
	private String classification;
	private String material;
	
	public MusicalInstrument(String classification, String material) {
		this.classification = classification;
		this.material = material;
	}
	public void play() {
		System.out.println("It is playing")
	}
}

