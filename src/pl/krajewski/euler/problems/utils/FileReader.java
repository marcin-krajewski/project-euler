package pl.krajewski.euler.problems.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

	public static String readProblemFile(String fileName) {
		try {
			StringBuilder sb = new StringBuilder();
			BufferedReader bufferedReader = getReader(fileName);
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

	private static BufferedReader getReader(String fileName)
			throws FileNotFoundException {
		File file = new File("res/files/"+fileName);
		try {
            System.out.println("FILE "+file.getCanonicalPath());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
		return bufferedReader;
	}
	
	public static String readProblemFileInOneLine(String fileName) {
		return readProblemFile(fileName).replaceAll("\n", "");
	}
	
	public static String[] readProblemFileLines(String fileName) {
		
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader bufferedReader = getReader(fileName);
			String s;
			while( (s = bufferedReader.readLine()) != null) {
				s = s.trim();
				if(!s.isEmpty()) {
					list.add(s);
				}
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return list.toArray(new String[]{});
	}
}
