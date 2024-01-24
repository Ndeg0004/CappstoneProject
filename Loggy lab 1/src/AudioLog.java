
public class AudioLog extends Log{
	private String audioFormat;
	private int audioSize; 

	public AudioLog(String name, String description, String date, String audioFormat, int audioSize) {
	super(name, description, date);
	this.audioFormat = audioFormat;
	this.audioSize = audioSize;
	}
	
	public void update(String newName, String newDescription, String newDate) {
		super.update(newName, newDescription, newDate);
		validateAudio();
	}
	
	private void validateAudio() {
		System.out.println("Successfully validated the Audio Log file");
	}
}
