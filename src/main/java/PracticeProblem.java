import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		String str1 = "a";
		char char1 = str1.charAt(0);
		System.out.println(char1);


	}

	public static void q2() {
		//Write question 2 code here
		System.out.print("Input a word: ");
		Scanner inputQ2 = new Scanner(System.in);
		String word = inputQ2.nextLine();
		char char3 = word.charAt(2);
		System.out.println(char3);

	}

	public static void q3() {
		//Write question 3 code here
		System.out.print("Input a word: ");
		Scanner inputQ3 = new Scanner(System.in);
		String wordQ3 = inputQ3.nextLine();
		char char2 = wordQ3.charAt(1);
		System.out.println("The second character user entered was: " + char2);
	}

	public static void q4() {
		//Write question 4 code here
		System.out.print("Input a number: ");
		Scanner inputQ4 = new Scanner(System.in);
		int numQ4 = inputQ4.nextInt();
		System.out.println("Your number plus 1 is: " + (numQ4+1));

	}

	public static void q5() {
		//Write question 5 code here
		System.out.print("Input a letter: ");
		Scanner inputQ5 = new Scanner(System.in);
		String strChar1 = inputQ5.nextLine();
		char charChar1 = strChar1.charAt(0);
		System.out.print("Input another letter: ");
		String strChar2 = inputQ5.nextLine();
		char charChar2 = strChar2.charAt(0);
		System.out.println(charChar1+charChar2);




	}

}
