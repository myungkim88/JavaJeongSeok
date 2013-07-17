package javaJeongSeok.thousand;
import java.util.*; 
/*
 * [문제2] 다음의 예제에서 while문의 내부를 주석의 내용을 참고해서 완성하세요.
 */
public class WordScrambleEx2 {
	public static void main(String[] args) {
		String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW" };

		String answer = getAnswer(strArr);
		String question = getScrambledWord(answer);

		while(true) { 
            System.out.println("Question :" + question); 
            System.out.print("Your answer is :"); 
            
            // 1. 화면을 통해 사용자의 입력을 받는다.(Scanner클래스 사용)
            // 2. 사용자가 q 또는 Q를 입력하면 프로그램을 종료한다.
            // 3. 사용자가 정답을 맞출때까지 반복하다가
            //     사용자가 정답을 맞추면, while문을 빠져나간다.
            Scanner sc = new Scanner(System.in);
            String string = sc.next().trim();
            if(string.equals(answer.trim())) {
            	System.out.println("correct");
            	break;
            }
            else if(string.toLowerCase().equals("q".trim())){
            	break;
            }
      }
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
