package all.program.utility;

import java.io.File;
import java.io.FileWriter;

public class Utility {
	//this function take two parameter 
		// 1 what data to write.
		// 2 file name
		public void writeToFile(String data,String fileName)throws Exception{
			File file = new File("/home/admin1/eclipse-workspace/DataStructure/linkedlist.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file); 
	       // Writes the content to the file
	       writer.write(data); 
	       writer.flush();
	       writer.close();
		}

}
