package InputOutput;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Java DataInputStream class allows an application to read primitive data from the input stream in a machine-independent way.

public class DIStream {
    public static void main(String[] args) {
        readStream();
    }

    public static void readStream() {
        String path = "InputOutput/files/DOStream.txt";

        File file = new File(path);

        try {
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                DataInputStream dis = new DataInputStream(fileInputStream);

                int count = fileInputStream.available();

                byte[] arr = new byte[count];

                dis.read(arr);

                for(byte bt : arr) {
                    char ch = (char)bt;
                    System.out.println(ch);
                }

                dis.close();

            } else {
                throw new FileNotFoundException();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
