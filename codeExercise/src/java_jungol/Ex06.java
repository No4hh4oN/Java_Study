// 정올-배열1-자가진단1 #555
package java_jungol;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = new String[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.next();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]);
		}
		
		//강사님 코드
		char[] ar = new char[10];
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.next().charAt(0);
		}
		sc.close();
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
	}
}