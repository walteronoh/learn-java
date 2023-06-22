package InputOutput;

import java.io.File;
import java.io.FileInputStream;

// FileInputStream is used for obtaining input bytes from a file
// Used for reading byte oriented data i.e ( streams of raw bytes ) e.g, images, videos, audio etc.
// FileReader class is recommended for reading streams of characters

public class FIStream {
    public static void main(String[] args) {
        readSingleCharacter();
        readAllCharacters();
    }

    public static void readSingleCharacter() {
        String path = "InputOutput/files/writeString.txt";
        try {
            // Get relative file path
            File file = new File(path);
            // Check if the file exists
            if (file.exists()) {
                // Create an instance of FileInputStream
                FileInputStream fileInputStream = new FileInputStream(file.getPath());
                // Read content from the file
                int i = fileInputStream.read();
                // To see the text, you need to convert it into character.
                char c = (char) i;
                System.out.println(c);
                fileInputStream.close();
                return;
            }
            System.out.println("The file does not exist");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void readAllCharacters() {
        String path = "InputOutput/files/writeString.txt";
        try {
            // Get relative file path
            File file = new File(path);
            // Check if the file exists
            if (file.exists()) {
                // Create an instance of FileInputStream
                FileInputStream fileInputStream = new FileInputStream(file.getPath());
                // Read content from the file while looping
                int i = 0;
                while((i = fileInputStream.read()) != -1) {
                    // To see the text, you need to convert it into character.
                    char c = (char) i;
                    System.out.println(c);
                }
                fileInputStream.close();
                return;
            }
            System.out.println("The file does not exist");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
