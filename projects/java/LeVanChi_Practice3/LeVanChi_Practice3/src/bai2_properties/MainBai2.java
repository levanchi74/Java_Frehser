package bai2_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class MainBai2 {
	public static void main(String[] args) {
		
		// Properties object
		Properties jvm = System.getProperties();
	
		Writer fileWriter = null;
		
		try {
			fileWriter = new FileWriter(".\\src\\bai2_properties\\data.txt");
			jvm.store(fileWriter, "properties jvm");
			fileWriter.flush();
			System.out.println("Properties stored to file");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fileWriter != null)
					fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		
	}

}
