package InputOutput;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// DataOutputStream class allows an application to write primitive Java data types to the output stream in a machine-independent way
// Java application generally uses the data output stream to write data that can later be read by a data input stream.

public class DOStream {
    public static void main(String[] args) {
        writeStream();
    }

    public static void writeStream() {
        String path = "InputOutput/files/DOStream.txt";

        File file = new File(path);

        try {
            if (file.exists()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                DataOutputStream dos = new DataOutputStream(fileOutputStream);

                dos.writeInt(65);

                dos.writeChars("Hello There");

                dos.close();

                System.out.println("Written Int to file");
            } else {
                throw new FileNotFoundException();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
}
