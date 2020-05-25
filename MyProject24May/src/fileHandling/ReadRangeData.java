package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadRangeData {
	public void ReadDataofARange(int a, int b) throws IOException {
		int startnum = a, endnum = b, count = 0;
		File f = new File("F:\\Selenuim Training Deepak Chanana\\Class13_24May\\FileToRead.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine()) != null){
			count++;
			if(count >= startnum && count <= endnum) {
				String line = s;
				System.out.println(line);
			}
	}
	}
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the starting line number");
		int x = s.nextInt();
		System.out.println("Please enter the last line number");
		int y = s.nextInt();
		ReadRangeData rrd = new ReadRangeData();
		rrd.ReadDataofARange(x, y);
	}
}