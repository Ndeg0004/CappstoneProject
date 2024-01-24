public class TextLog extends Log {
	private String content;
	private String attachedFileName;
	private String attachedFileFormat;
	private String attachedFileContent;
	private Long attachedFileSize;
	
	
	public TextLog(String name, String description, String date, String content) {
		super(name, description, date);
		this.content = content;
		
	}

	public String getContent() {
	return content;	
	}
	
	public void update(String newName, String newDescription, String newDate) {
		super.update(newName, newDescription, newDate);
		validateText();
	}
	
	private void validateText() {
		System.out.println("Successfully validated TextLog");
}
	
// 
	 public void attachFile(String fileName, String format, String content, Long size) {
		 this.attachedFileName = fileName;
		 this.attachedFileFormat = format;
		this.attachedFileContent = content;
		this.attachedFileSize = size;
		System.out.println("Textlog file atteched" + fileName);
		
	 }
		
	public String toString(){ 
		return super.toString() +
				"/nAttached File: "  +
				"Name=" + attachedFileName +
				", Format" + attachedFileFormat +
				", Size" + attachedFileSize;
		
	}
		
	 }
	 