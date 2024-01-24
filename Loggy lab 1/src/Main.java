
public class Main {

    public static void main(String[] args) {
        Log log = null;

        // This should throw an exception as PNG is not a type handled by Text.
        log = new TextLog("first log", "Monday May 4, I had to wake up early", "2024-01-22", "this is the content");
        try {
            ((TextLog) log).attachFile("image.png", "PNG", "******", Long.valueOf(1024));
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.create();
        System.out.println("New log (" + log.toString() + ")\n");

        log = new ImageLog("second log", "Few minutes later, I had my first cup of coffee", "2024-01-22");
        try {
            ((ImageLog) log).attachFile("coffee.png", "PNG", "******", Long.valueOf(1024));
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.create();
        System.out.println("New log (" + log.toString() + ")\n");

        log = new VideoLog("third log", "Few minutes later, I am going for a bike ride", "2024-01-22", "MP4", 1024);
        try {
            ((VideoLog) log).attachFile("biking1.mp4", "MP4", "******", Long.valueOf(1024));
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.create();
        System.out.println("New log (" + log.toString() + ")\n");
    }
}
