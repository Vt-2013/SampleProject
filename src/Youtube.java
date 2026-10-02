import java.awt.Desktop;
import java.net.URI;

class YouTube {
    public static void main(String[] args) {
        try {
            // YouTube video URL
            String url = "https://www.youtube.com/watch?v=2MZQKsiUk7E";

            // Check if the desktop is supported
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI(url));
                System.out.println("Opening YouTube video...");
            } else {
                System.out.println("Desktop is not supported!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}