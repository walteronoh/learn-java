package InputOutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

// FilterInputStream contains different sub classes as BufferedInputStream, DataInputStream for providing additional functionality
public class FilterIStream {
    public static void main(String[] args) {
        inputStream();
    }

    public static void inputStream() {
        String path = "InputOutput/files/FilterOutput.txt";

        File file = new File(path);

        try {
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                FilterInputStream filterInputStream = new BufferedInputStream(fileInputStream);

                int k = 0;
                while ((k = filterInputStream.read()) != -1) {
                    char c = (char) k;
                    System.out.println(c);
                }
                filterInputStream.close();
                fileInputStream.close();
            } else {
                throw new FileNotFoundException();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
