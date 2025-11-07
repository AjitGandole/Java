
public class rotation {

	public static void main(String[] args) {
		String a="AJIT";
		String b="ITAJ";
		
		if(isRotation(a , b)) {
			System.out.println(a+" is the rotation of "+b);
		}else {
			System.out.println(a+"is not a rotation of "+b);
		}

	}
	public static boolean isRotation(String s1,String s2) {
		return (s1.length()==s2.length() && (s1+s1).contains(s2));
	}
}
