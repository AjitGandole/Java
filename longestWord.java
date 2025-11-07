public class longestWord {
	public static void main(String[] args) {
		String a="Ajit anil asha avinash";
		String [] words=a.split(" ");
		String comp="";
		
		for (String word:words){
			if(word.length()>comp.length()) {
				comp=word;
			}		
		}
		System.out.println(comp);
	}
}