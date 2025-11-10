
public class capitalLetter {

	public static void main(String[] args) {
		String a="bangalore is a shit city that rottes everday with sweat and blood";
		String[] b=a.split(" ");
		String s1 = "";
		
		for(String c:b) {
			s1+=c.substring(0, 1).toUpperCase()+c.substring(1)+" ";	
		}
		System.out.println(s1);
	}

}
