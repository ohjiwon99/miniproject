package miniproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;
import java.util.Scanner;

public class PhoneDB {

	public static void main(String[] args) throws IOException {

		// 1.시작화면

		boolean run = true;
		int num = 0;
		String str = "";
		System.out.println("***************************************");
		System.out.println("*          전화번호 관리 프로그램           *");
		System.out.println("***************************************");

		Scanner sc = new Scanner(System.in);

		Reader fr = new FileReader("C:\\javastudy\\PhoneDB_원본mini.txt");
		BufferedReader br = new BufferedReader(fr);

		while (run) {

			System.out.println("1.리스트   2.등록   3.삭제   4.검색   5.종료");
			System.out.println("---------------------------------------");
			System.out.print("메뉴번호 >> ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println();
				System.out.println("<1. 리스트>");
				System.out.println();
				showinfo(null);
				break;
			case 2:
				System.out.println();
				System.out.println("<2. 등록>");

				break;
			case 3:
				System.out.println();
				System.out.println("<3. 삭제>");
				System.out.print("번호 >> ");
				break;
			case 4:
				System.out.println();
				System.out.println("<4. 검색>");
				System.out.print("이름 >> ");
				str = sc.next();
				System.out.println();
				break;
			case 5:
				System.out.println();
				System.out.println("***************************************");
				System.out.println("*              감사합니다                *");
				System.out.println("***************************************");
				sc.close();
				run = false;
				break;
			default:
				System.out.println("[다시 입력해 주세요]");
				System.out.println();
				sc.close();
				run = false;
				break;

			}
		}
	}

	private static void search(List<Person> PS, String str) {
		for (int i = 0; i < PS.size(); i++) {
			Person serchperson = (Person) PS.get(i);
			if (serchperson.getName().contains(str)) {
				System.out.println(serchperson.toString());
			}
		}
	}

	private static void delete(Scanner sc, List<Person> person) {
		int del = sc.nextInt();
		person.remove(del - 1);
		System.out.println();
		System.out.println("[삭제되었습니다.]");
	}

	// 리스트 출력
	private static void showinfo(List<Person> person) {
		for (int i = 0; i < person.size(); i++) {
			System.out.println(person.get(i).toString());
		}
	}

	// 리스트에 추가
	private static void add(Scanner sc, List<Person> person) {
		String name;
		String hp;
		String tel;
		System.out.print(">이름    : ");
		name = sc.next();
		System.out.print(">휴대전화 : ");
		hp = sc.next();
		System.out.print(">집전화   : ");
		tel = sc.next();
		person.add(new Person(name, hp, tel));
		update(person);
		System.out.println();
		System.out.println("[등록되었습니다.]");
	}

	// 번호 순차대로 다시 넘버링
	private static void update(List<Person> person) {
		for (int i = 0; i < person.size(); i++) {
			Person n = (Person) person.get(i);
			// n.setNum (i + 1);
		}
	}

	// 텍스트 읽어오기
	private static List<Person> readTxt(List<Person> person) {
		Reader fr = null;
		BufferedReader br = null;
		try {
			String address = null;
			fr = new FileReader(address);
			br = new BufferedReader(fr);
			String line = "";
			String[] words = new String[3];
			while ((line = br.readLine()) != null) {
				words = line.split(",");
				person.add(new Person(words[0], words[1], words[2]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		update(person);
		return person;
	}

	private static void wirteTxt(List<Person> person) {
		Writer fw = null;
		BufferedWriter bw = null;

		try {
			String address = null;

			fw = new FileWriter(address);

			bw = new BufferedWriter(fw);

			for (int i = 0; i < person.size(); i++) {
				Person writeperson = (Person) person.get(i);
				bw.write(writeperson.getName() + ",");
				// bw.write(writeperson.getCellphone() + ",");
				// bw.write(writeperson.getHomephone());
				bw.write("\r\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

// 1.시작화면

// 2.리스트(30)
// 3.등록(20)
// 4.삭제(20)
// 5.없는메뉴(10)
// 6.종료(10)
// 7.검색
