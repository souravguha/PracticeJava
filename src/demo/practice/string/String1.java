package demo.practice.string;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Sourav";
		String str2 = "Guha";
		
		String text1 = "Hi ".concat(str1).concat(str2);
		String text2 = str1.concat(" ").concat(str2);
		String text3 = text1.concat(" ").concat("bye");
		String text4 = str1 + str2;
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
	}

}
