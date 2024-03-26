public class ImageLog extends Log {
    private String imageFormat;
	private String attachedFileName;
	private String attachedFileFormat;
	private String attachedFileContent;
	private Long attachedFileSize;
	

    public ImageLog(String name, String description, String date) {
        super(name, description, date);
    }

    public String getImageFormat() {
        return imageFormat;
    }

    //guard clause implemented
    public void attachFile(String fileName, String format, String content, Long size) throws Exception {
        if (!format.equals("PNG") && !format.equals("JPEG")) {
            throw new Exception("Invalid image format");
        }

        if (size > 1024) {
            throw new Exception("Image size exceeds the limit");
        }

        System.out.println("Image attached: " + fileName);
    }


    public void update(String newName, String newDescription, String newDate) {
        super.update(newName, newDescription, newDate);
        validateImage();
    }

    private void validateImage() {
        System.out.println("Image log validated.");
    }
    
    //reduntent code
    //public void attachedFile(String fileName, String format, String content, Long size) {
	//	 this.attachedFileName = fileName;
	//	 this.attachedFileFormat = format;
	//	this.attachedFileContent = content;
	//	this.attachedFileSize = size;
	//	System.out.println("Textlog file atteched" + fileName);
		
  //  }
		
	public String toString(){ 
		return super.toString() +
				"/nAttached File: "  +
				"Name=" + attachedFileName +
				", Format" + attachedFileFormat +
				", Size" + attachedFileSize;
		
	}
		
	 }

