package InputOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

// Buffered Output Stream - Used for buffering an output stream.
// It internally uses buffer to store data
// It adds more efficiency than to write data directly into a stream hence its performance is fast

public class BOStream {
    public static void main(String[] args) {
        writeBuffer();
    }

    public static void writeBuffer() {
        String path = "InputOutput/files/writeBuffer.txt";
        try {
            // Get relative file path
            File file = new File(path);
            // Check if file exists
            if(file.exists()) {
                // Connect the streams i.e, FileOutputStream and BufferedOutputStream
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                // Create an instance of Buffered output stream
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                String string = "Writing Buffer to file";
                // Get bytes from string
                byte[] b = string.getBytes();
                // Write to stream
                bufferedOutputStream.write(b);
                // The flush() flushes the data of one stream and send it into another.
                // It is required if you have connected one stream with another.
                bufferedOutputStream.flush();
                // Close
                bufferedOutputStream.close();
                fileOutputStream.close();
                System.out.println("Buffer successfully written to file");
                return;
            }
            System.out.println("The file does not exist");
        } 
        catch (Exception e) {}
    }
}
