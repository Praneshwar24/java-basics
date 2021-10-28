package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		try {
			FileOutputStream foutPipe = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\JavaProgram\\testout.txt");
			foutPipe.write(68);
			foutPipe.close();  //closing the pipe
			System.out.println("Success....");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
