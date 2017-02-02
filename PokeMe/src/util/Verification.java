package util;



public class Verification {

	private static final String VERIFICATION = 	"------------------------------ VERIFICATION ------------------------------";
	private static final String TITLE = 		"\tTitle:    ";
	private static final String EXPECTED = 		"\tExpected: ";
	private static final String ACTUAL = 		"\tActual:   ";
	private static final String RESULT = 		"\tResult:   ";
	private static final String END = 			"--------------------------------------------------------------------------";

	private static void print(String expected, String actual, String title, boolean result) {

		System.out.println(VERIFICATION);
		System.out.println(TITLE + title);
		System.out.println(EXPECTED + expected);
		System.out.println(ACTUAL + actual);
		if (result) 
			System.out.println(RESULT + "Passed");
		else 
			System.out.println(RESULT + "Failed");
		System.out.println(END);
		assert result;

	}


	public static void verifyString(String expected, String actual, String title) {
		boolean b = expected.equals(actual/*.subSequence(0, 17)*/);
		print(expected, actual/*.substring(0, 17)*/, title, b);
	}
	
	public static void verifyErrorMsg(String expected, String actual, String title) {
		boolean b = expected.equals(actual);
		print(expected, actual, title, b);
	}

	
	public static void verifyBoolean(boolean expected, boolean actual, String title) {
		boolean b = expected == actual;
		print(expected + "", actual + "", title, b);
	}

	
	public static void verifyInteger(int expected, int actual, String title) {
		boolean b = expected == actual;
		print(expected + "", actual + "", title + "", b);
	}
}
