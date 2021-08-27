package basic_java;

import java.util.Scanner;

public class End_of_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while(scan.hasNext()) {
			i++;
			System.out.println(i + " " + scan.nextLine());
		}

	}

}
/*
Hello world
I am a file
Read me until end-of-file.
*/