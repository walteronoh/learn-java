package InputOutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

// BufferedInputStream - Used to read information from Stream.

public class BIStream {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        String path = "InputOutput/files/writeBuffer.txt";
        try {
            // Get relative file path
            File file = new File(path);
            // Check if the file exists
            if (file.exists()) {
                // Create an instance of FileInputStream
                FileInputStream fileInputStream = new FileInputStream(file.getPath());
                // Read Stream from BufferedInputStream
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                int i = 0;
                // loop stream as you read the content
                while ((i = bufferedInputStream.read()) != -1) {
                    System.out.println((char) i);
                }
                bufferedInputStream.close();
                fileInputStream.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
