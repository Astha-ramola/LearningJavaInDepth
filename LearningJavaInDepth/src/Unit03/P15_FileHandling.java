package Unit03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class P15_FileHandling {

	public static void main(String[] args) {
		
		ABC6 obj = new ABC6();
		obj.takeInputFromAFileNotFromConsole();
		obj.saveOutputIntoAFile();
		obj.createALogFile();
	}

}

class ABC6{
	static int a = 10;
	void takeInputFromAFileNotFromConsole() {
		String path = "Input.txt";
		File file = new File(path);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		//String st;
		//while((st=br.readLine())!=null) {
		//	System.out.println("st");
		//}
		
		//list that holds strings of a file
		List<String>listOfStrings=new ArrayList<String>();
		
		//read entire line as string
		String line = br.readLine();
		
		while(line != null) {
			listOfStrings.add(line);
			line = br.readLine();
		}
		for(String str:listOfStrings) {
			System.out.println(str);
		}
		System.out.println("\n");
		br.close();
			
	}
	
	void saveOutputIntoAFile() {
		FileWriter myObj = null;
		
		try {
			myObj = new FileWriter("output.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter f_writer = new BufferedWriter(myObj);
		
		String text = "Hey this would store in Output file";
		
		f_writer.write(text);
		f_writer.close();
	}
	
	
	
	void createALogFile() {
        a++;
		
		//Find current time and Date
		LocalTime ltime = java.time.LocalTime.now();
		LocalDate ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;

		try {
		myObj = new FileWriter("log.txt",true);
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";

		try {
			f_writer.write("Value of a: " + a + ", ");
	        f_writer.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		f_writer.close();

	}
}