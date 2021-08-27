package basic_java;

import java.util.Scanner;

public class Int_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			String s = String.valueOf(n);
			//String s = Integer.toString(n);
			
			if(n == Integer.parseInt(s)) {
				System.out.println("Good Job");
			}
			else {
				System.out.println("Wrong answer.");
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Unsuccessful Termination!!");
		}
	}

}
