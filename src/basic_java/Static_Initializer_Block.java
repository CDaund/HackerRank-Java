package basic_java;

import java.util.Scanner;

public class Static_Initializer_Block {

	static Scanner input = new Scanner(System.in);
	static boolean flag = true;
	static int B = input.nextInt();
	static int H = input.nextInt();
	
	static {
		try {
			if(B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

}
