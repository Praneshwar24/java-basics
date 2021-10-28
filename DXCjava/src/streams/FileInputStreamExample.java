package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\JavaProgram\\testout.txt");
			int i = 0;
			while((i = fin.read())!= -1) {
				System.out.println((char)i);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
