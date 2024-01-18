package miniproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class eee {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		// 1.시작화면
		System.out.println("********************************************");
		System.out.println("*          전화번호 관리 프로그램           *");
		System.out.println("********************************************");

		boolean run = true;

		Reader fr = new FileReader("C:\\javastudy\\PhoneDB_원본mini.txt");
		BufferedReader br = new BufferedReader(fr);

		while (run) {

			break;
		}

		System.out.println("1.리스트   2.등록   3.삭제   4.검색   5.종료");
		System.out.println("---------------------------------------");
		System.out.print("메뉴번호 >> ");
		int num = sc.nextInt();

		// 2.리스트

		switch (num) {
		case 1:
			String str = br.readLine();
			System.out.println();
			System.out.println("<1. 리스트>");
			System.out.println();
			System.out.println(br);
			if (str == null) {
				break;
			}
			String[] PI = str.split(",");

		}

		// 2.리스트

		sc.close();
	}
}
