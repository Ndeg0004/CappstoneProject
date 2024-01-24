import java.util.UUID;


public class Log {
	private String id;
	private String shortCode;
	private String name;
	private String description;
	private String date;
	
	
public Log(String name, String description, String date) {
	// used "this" to make a distinction between the named parameter with the same name 
	this.id = UUID.randomUUID().toString();
	this.shortCode = generateShortCode();
	this.name = name;
	this.description = description;
	this.date = date;	
	
}

public String getId() {
	return id;
}

public String getShortCode() {
	return shortCode;
}

public String getName() {
	return name;
}


public String getDescription() {
	return description;
}

public String getDate() {
	return date;
}

public void create() {
	System.out.println("Log created" + toString());
}


public void read() {
	System.out.println("Log read: " + toString());
}


public void update(String newName, String newDescription, String newDate) {
this.name = newName;
this.description = newDescription;
this.date = newDate;
System.out.println("Log updated: " + toString());
}

public void delete() {
	System.out.println("Log deleted: " + toString());
}

private String generateShortCode() {
	return UUID.randomUUID().toString().substring(0, 8);
}

public void performAction(LogAction action) {
	action.performAction();
}

@Override
public String toString() {
	return "ID: " + id + ", Short Code: " + shortCode + ", Name: " + name + ", Description " + description + ", Date: "+ date;
	
}
}




