package InputOutput;

import java.io.File;
import java.io.FileOutputStream;

// FileOutputStream is a stream used for writing data to a file.

public class FOStream {
    public static void main(String[] args) {
        writeByte();

        writeString();
    }

    public static void writeByte() {
        String path = "InputOutput/files/writeByte.txt";
        try {
            // get relative file path
            File file = new File(path);
            if(file.exists()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
                // Write Bytes to the stream
                // The content is 'A'
                fileOutputStream.write(65);
                // Close the stream
                fileOutputStream.close();
                System.out.println("Bytes written to file");
                return;
            }
            System.out.println("The file does not exist!");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public static void writeString() {
        String path = "InputOutput/files/writeString.txt";
        try {
            // get relative file path
            File file = new File(path);
            if(file.exists()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
                // String to be written to the file
                String string = "Writing Stream using FileOutputStream";
                // Convert the String to bytes
                byte[] s = string.getBytes();
                // Write bytes to the stream
                fileOutputStream.write(s);
                // Close the stream
                fileOutputStream.close();
                System.out.println("String written to file");
                return;
            }
            System.out.println("The file does not exist!");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
