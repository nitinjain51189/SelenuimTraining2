package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CloneAFile {
	public void ReadAndWrite() throws IOException {
		File f = new File("F:\\Selenuim Training Deepak Chanana\\Class13_24May\\FileToRead.txt");
		File ftw = new File("F:\\Selenuim Training Deepak Chanana\\Class13_24May\\ClonedFile.txt");
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(ftw);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String s;
		while((s = br.readLine()) != null) {
			String line = s;
			bw.write(line);
			bw.newLine();
		}
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		CloneAFile caf = new CloneAFile();
		caf.ReadAndWrite();
	}
	
}
