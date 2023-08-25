package InputOutput;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// ByteArrayOutputStream is used to write common data into multiple files.
// The data is written into byte array which can be later written into multiple streams
// The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
// The buffer of ByteArrayOutputStream automatically grows according to data. 

public class BAOStream {
    public static void main(String[] args) {
        writeStream();
    }

    public static void writeStream() {
        File file1 = new File("InputOutput/files/BAOStreams1.txt");
        File file2 = new File("InputOutput/files/BAOStreams2.txt");

        try {
            if (file1.exists() && file2.exists()) {
                FileOutputStream fileOutputStream1 = new FileOutputStream(file1.getPath());
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2.getPath());

                ByteArrayOutputStream bout = new ByteArrayOutputStream();

                bout.write(65);
                bout.writeTo(fileOutputStream1);
                bout.writeTo(fileOutputStream2);

                bout.close();
                fileOutputStream1.close();
                fileOutputStream2.close();
                System.out.println("Success");
            } else {
                throw new FileNotFoundException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
