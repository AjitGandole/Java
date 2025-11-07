
public class reverseWords {

	public static void main(String[] args) {
		String a="I AM A ENGINEER STUDENT FROM HUBBALLI";
		String[] b=a.split(" ");
		String res="";
		
		for (int i=0;i<=b.length-1;i++) {
			String c =isReverse(b[i]);
			res+=" "+c;
		}
		System.out.println(res);

	}

	private static String isReverse(String s1) {
		return new StringBuilder(s1).reverse().toString();
		
		
	}

}
