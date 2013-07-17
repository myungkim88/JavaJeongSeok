package javaJeongSeok.thousand;

/*
 * [문제1] 다음의 예제를 완성하시오.
 * getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)
 * getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다.
 * (Math.random()사용)
 */
public class WordScrambleEx1 {
	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };

		String answer = strArr[0];//getAnswer(strArr);
		String question = getScrambledWord(answer);

		System.out.println("Question:" + question);
		System.out.println("Answer:" + answer);
	} // main

	public static String getAnswer(String[] strArr) {
		int temp = (int) (((Math.random() * 10)) % 4);
		return strArr[temp];
	}

	public static String getScrambledWord(String str) {
		// instead using these following lines:
		/*
		 * char[] input = new char[str.length()]; for (int i=0; i<str.length();
		 * i++){ input[i] = str.charAt(i); }
		 */
		// you can simply use following codes:
		char[] input = str.toCharArray();
		// //////////////////////////////////

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

		// insteaqd using these following lines:
		/*
		 * String outputStringForm = ""; for (int i=0; i<str.length(); i++){
		 * outputStringForm = outputStringForm + output[i]; }
		 */
		// you can simply use following codes:
		String outputStringForm = new String(output);
		/////////////////////////////////////
		
		return outputStringForm;
	}
}
