package InputOutput;

import java.io.ByteArrayInputStream;

// ByteArrayInputStream can be used to read byte array as input stream
// The buffer of ByteArrayInputStream automatically grows according to data

public class BAIStream {
    public static void main(String[] args) {
        readStreams();
    }

    public static void readStreams() {
        byte[] buf = { 35, 36, 37, 38 };  
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);

        int i = 0;

        while((i = byteArrayInputStream.read()) != -1) {
            System.out.println(i);
            // Convert byte to character
            char ch = (char)i;
            System.out.println("ASCII value of Character is:" + i + "; Special character is: " + ch);  
        }
    }
}
