/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q3_original;
import java.io.*;

        public class Cal2 extends Cal{
            
        public void log(String msg){           
		try {
                        File file = new File("log.txt");
			FileWriter outputFile = new FileWriter(file, true);
			PrintWriter out = new PrintWriter(outputFile);
			// Write text to file
			out.println(msg);
			out.flush();
			out.close();
		} catch (IOException e){
			e.printStackTrace();
		}
        }
        
        }