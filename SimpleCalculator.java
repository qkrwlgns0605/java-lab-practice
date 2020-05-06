package SimpleCalculator;

import java.util.Scanner;
import java.io.*;

class AddZeroException extends Exception{
	
}

class SubtractZeroException extends Exception{
	
}

class OutOfRangeException extends Exception{
	
}

public class SimpleCalculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,s1,s2;
		int i1,i2,result;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		try {
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='+' && i!=0) {
				s1 = s.substring(0,i);
				s2 = s.substring(i+1, s.length());
				i1 = Integer.parseInt(s1);
				i2 = Integer.parseInt(s2);
				if(i1 == 0 || i2 == 0) {
					throw new AddZeroException();
				}
				else if(i1 < 0 || i1 > 1000 || i2 < 0 || i2 > 1000) {
					throw new OutOfRangeException();
				}
				else {
					result = i1+i2;
					if(result > 1000 || result < 0) {
						throw new OutOfRangeException();
					}
					else {
						System.out.println(result);
					}
				}
			}
			else if(s.charAt(i)=='-' &&i!=0) {
				s1 = s.substring(0,i);
				s2 = s.substring(i+1, s.length());
				i1 = Integer.parseInt(s1);
				i2 = Integer.parseInt(s2);
				if(i1 == 0 || i2 == 0) {
					throw new SubtractZeroException();
				}
				else if(i1 < 0 || i1 > 1000 || i2 < 0 || i2 > 1000) {
					throw new OutOfRangeException();
				}
				else {
					result = i1-i2;
					if(result > 1000 || result < 0) {
						throw new OutOfRangeException();
					}
					else {
						System.out.println(result);
					}
				}
				
			}
		}
		}
		catch(AddZeroException e1) {
			System.out.println("AddZeroException");
			
		}
		catch(SubtractZeroException e2) {
			System.out.println("SubtractZeroException");
		}
		catch(OutOfRangeException e3) {
			System.out.println("OutOfRangeException");
		}
	}
}
