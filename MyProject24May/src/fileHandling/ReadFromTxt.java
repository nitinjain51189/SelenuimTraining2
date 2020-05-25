package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromTxt {
	public void ReadDataofParticularLine(int a) throws IOException {
		int linenum = a, count = 0;
		File f = new File("F:\\Selenuim Training Deepak Chanana\\Class13_24May\\FileToRead.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine()) != null) {
			count++;
			if (count == linenum) {
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the line number");
		int x = s.nextInt();
		ReadFromTxt rft = new ReadFromTxt();
		rft.ReadDataofParticularLine(x);
	}

}
