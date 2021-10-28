
package streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInStreamEx1 {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\JavaProgram\\testout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while((i = bin.read())!= -1) {
				System.out.println((char)i);
			}
			bin.close();
			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}



