package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandle {

	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("test.txt",true)) {
			BufferedWriter bw=new BufferedWriter(fw);
//			FileWriter fw=new FileWriter("test.txt",true);
			fw.append("Hello ggg");
			FileReader fr=new FileReader("test.txt");
			int r=fr.read();
			System.out.println((char)r);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			System.out.println(line);
			
		}
		catch(Exception e){
			System.out.println("error");
		}
		

	}

}
