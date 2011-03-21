package pl.krajewski.euler.problems.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {

	public static String readProblemFile(String fileName) {
		try {
			StringBuilder sb = new StringBuilder();
			FileInputStream fileInputStream = new FileInputStream(new File("res\\files\\"+fileName));
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String s;
			while( (s = bufferedReader.readLine()) != null) {
				sb.append(s);
				sb.append("\n");
			}
			return sb.toString();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
