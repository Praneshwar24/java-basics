package streams;

import java.io.FileInputStream;

public class FileInputStreamExample2 {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\JavaProgram\\testout.txt");
			int i = fin.read();
			System.out.println((char)i);

			fin.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
