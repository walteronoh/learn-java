package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

// Sequence Input Stream reads data from multiple streams

public class SIStream {

    public static void main(String[] args) {
        readStreams();
    }

    public static void readStreams() {
        String path1 = "InputOutput/files/writeBuffer.txt";
        String path2 = "InputOutput/files/writeString.txt";

        // Get relative file paths
        File file1 = new File(path1);
        File file2 = new File(path2);

        try {
            if (file1.exists() && file2.exists()) {
                // Create instances of FileInputStream
                FileInputStream fileInputStream1 = new FileInputStream(file1);
                FileInputStream fileInputStream2 = new FileInputStream(file2);

                // Create instances of SequenceInputStream
                SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);

                int i;
                while ((i = sequenceInputStream.read()) != -1) {
                    // To see the text, you need to convert it into character.
                    char c = (char) i;
                    System.out.println(c);
                }

                // Close all the streams
                sequenceInputStream.close();
                fileInputStream1.close();
                fileInputStream2.close();

                return;
            }
            throw new FileNotFoundException();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
