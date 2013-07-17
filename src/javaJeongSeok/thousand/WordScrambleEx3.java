package javaJeongSeok.thousand;

import java.util.*;

/*
 * [문제3] 문제2의 예제를 변경해서, 문제를 맞추더라도 프로그램이 종료되지 않고 다음문제를 보여주도록 하세요.
 */

public class WordScrambleEx3 {
	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };
		Object[] questions;

		Hashtable hashtbl = new Hashtable();

		while (hashtbl == null || hashtbl.size() < strArr.length) {
			String tmp = getAnswer(strArr);
			hashtbl.put(tmp, tmp);
		}
		questions = hashtbl.values().toArray();

		int count = 0;

		while (count < 4) {
			String answer = (String) questions[count];
			String question = getScrambledWord(answer);
			while (true) {
				System.out.println("Question :" + question);
				System.out.print("Your answer is :");

				Scanner sc = new Scanner(System.in);
				String string = sc.next().trim();
				if (string.equals(answer.trim())) {
					System.out.println("correct");
					break;
				} else if (string.toLowerCase().equals("q".trim())) {
					break;
				}
			}
			count++;
		}
		
		System.out.println("successfully finished");
	}

	public static String getAnswer(String[] strArr) {
		int temp = (int) (((Math.random() * 10)) % strArr.length);
		return strArr[temp];
	}

	public static String getScrambledWord(String str) {
		char[] input = str.toCharArray();
		char[] output = new char[str.length()];
		boolean isFilled = false;
		for (int i = 0; i < str.length(); i++) {
			while (!isFilled) {
				int random = (int) (((Math.random() * 10)) % str.length());
				if (output[random] == '\u0000') {
					output[random] = input[i];
					isFilled = true;
				}
			}
			isFilled = false;
		}
		String outputStringForm = new String(output);

		return outputStringForm;
	}
}
