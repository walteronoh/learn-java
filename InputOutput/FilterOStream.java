package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

// FilterOutputStream provides different sub classes such as BufferedOutputStream and DataOutputStream to provide additional functionality
public class FilterOStream {
    public static void main(String[] args) {
        outputStream();
    }

    public static void outputStream() {
        String path = "InputOutput/files/FilterOutput.txt";

        File file = new File(path);

        try {
            if (file.exists()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream);

                String string = "Writing Content to file";
                byte b[] = string.getBytes();

                filterOutputStream.write(b);
                filterOutputStream.flush();

                filterOutputStream.close();
                fileOutputStream.close();

                  System.out.println("Success...");

            } else {
                throw new FileNotFoundException();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
