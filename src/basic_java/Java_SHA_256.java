package basic_java;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Java_SHA_256 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		MessageDigest m = MessageDigest.getInstance("SHA-256");
		m.reset();
		m.update(input.nextLine().getBytes());
		for(byte i : m.digest()) {
			System.out.print(String.format("%02x", i));
		}
		System.out.println();
	}

}
