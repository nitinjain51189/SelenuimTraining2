package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
	public void WriteDatainaFile(int a) throws IOException {
		int linecount = a, linenum;
		Scanner sc = new Scanner(System.in);
		File f = new File("F:\\Selenuim Training Deepak Chanana\\Class13_24May\\FileToWrite.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<linecount;i++) {
				linenum = i+1;
			System.out.println("Please enter line "+linenum);	
			String line = sc.nextLine();
			bw.write(line);
			bw.newLine();
			}
			bw.close();
	}
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number of lines need to be entered");
		int x = s.nextInt();
		WriteToFile wtf = new WriteToFile();
		wtf.WriteDatainaFile(x);
	}
	}
