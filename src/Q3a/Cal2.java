package Q3a;

import java.io.*;
/**
 * @author ckc
 */
public class Cal2 extends Cal{
        public void log(String msg) {
        File file = new File("log.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                FileWriter outputFile = new FileWriter(file, true);
                PrintWriter out = new PrintWriter(outputFile);

                // Write text to file
                out.println(msg);
                // write the text from buffer to the file
                out.flush();
                // close the file after use
                out.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
