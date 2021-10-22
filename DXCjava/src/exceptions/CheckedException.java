package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("jutsu.txt");
			pw.println("saved");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("File saved successfully");

	}

}
