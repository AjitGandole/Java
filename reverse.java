
public class reverse {

	public static void main(String[] args) {
		String a="Ajit";
		System.out.println(reverseString(a));

	}

	public static String reverseString(String a) {
		return new StringBuilder(a).reverse().toString();
	}
}
