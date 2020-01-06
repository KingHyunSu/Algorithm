package algo;

public class Programmers12948 {
	public static void main(String[] args) {
		String answer = "";
		
		String phone_number = "01033334444";
		
		
		int phoneLen = phone_number.length()-4;
		
		String surfix = phone_number.substring(phoneLen);
		
		String prefix = "";
		for(int i = 0; i < phoneLen; i++) {
			prefix += "*";
		}
		
		answer = prefix + surfix;
		System.out.print(answer);
	}
}
