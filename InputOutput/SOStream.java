package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

// Sequence Input Stream reads data from multiple streams and writes them to another file
public class SOStream {
    public static void main(String[] args) {
        writeStreamsToFile();
    }

    public static void writeStreamsToFile() {
        String path1 = "InputOutput/files/writeBuffer.txt";
        String path2 = "InputOutput/files/writeString.txt";
        String path3 = "InputOutput/files/writeStreams.txt";

        // Get relative file paths
        File file1 = new File(path1);
        File file2 = new File(path2);
        File file3 = new File(path3);

        try {
            if (file1.exists() && file2.exists()) {
                // Create instances of FileInputStream
                FileInputStream fileInputStream1 = new FileInputStream(file1);
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file3);

                // Create instances of SequenceInputStream
                SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);

                int i;
                while ((i = sequenceInputStream.read()) != -1) {
                    fileOutputStream.write(i);
                }

                // Close all the streams
                sequenceInputStream.close();
                fileInputStream1.close();
                fileInputStream2.close();
                fileOutputStream.close();

                return;
            }
            throw new FileNotFoundException();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
