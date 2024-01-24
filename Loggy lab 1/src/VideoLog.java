
public class VideoLog extends Log{
	private String videoFormat;
	private int videoSize;
	private String attachedFileName;
	private String attachedFileFormat;
	private String attachedFileContent;
	private Long attachedFileSize;
	
 
	
	public VideoLog(String name, String date, String description, String videoFormat, int videoSize) {
		super(name, description, date);
		this.videoFormat = videoFormat;
		this.videoSize = videoSize;
	}
	
	public String getVideoFormat() {
		return videoFormat;
	}
	
	public int videoSize() {
		return videoSize;
	}
	
	public void update(String newName, String newDescription, String newDate) {
		super.update(newName, newDescription, newDate);
		validateVideo();
	}
	
	private void validateVideo() {
		System.out.println("Succesfully valideated VideoLog");
	}
		
	
	public void attachFile(String fileName, String format, String content, Long size) {
		 this.attachedFileName = fileName;
		 this.attachedFileFormat = format;
		this.attachedFileContent = content;
		this.attachedFileSize = size;
		System.out.println("Videolog file atteched" + fileName);
		
	}
		
	public String toString(){ 
		return super.toString() +
				"/nAttached File: "  +
				"Name=" + attachedFileName +
				", Format" + attachedFileFormat +
				", Size" + attachedFileSize;
		
	}
		
	 }
	

