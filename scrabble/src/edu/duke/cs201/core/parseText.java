package edu.duke.cs201.core;
// transform the textual file into a 2d-array
import java.io.*;
import java.util.*;
public class parseText {
	private String filepath;
	public parseText(String filepath) {
		this.filepath = filepath;
	}
	private ArrayList<String> readFile() {
		ArrayList<String> data = new ArrayList<String>();
		try{
			File f = new File(this.filepath);
			Scanner fr = new Scanner(f);
			while (fr.hasNextLine()) {
				String line = fr.nextLine();
				data.add(line);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		}
		return data;
	}		
	public char[][] parseFile() {
		ArrayList<String> data = readFile();
		int size = data.size();
		char [][]chars = new char[size][size];
		for (int i=0; i<size; i++) {
			String []strs = data.get(i).split(" ");
			for (int j=0; j<size; j++) {
				char tmp = strs[j].charAt(0);
				if (tmp == '*') {
					if ((i+j)%2 == 0) {
						tmp = '@';
					}
					else {
						tmp = '#';
					}
				}
				chars[i][j] = tmp;
			}
		}		
		return chars;
	}
	/*
	public static void main(String args[]) {
		parseText pt = new parseText("board.txt");
		char [][]chars = pt.parseFile();
		int size = chars.length;
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(chars[i][j]);
			}
			System.out.println();
		}
	}
	*/
}

