
public class duplicates {

	public static void main(String[] args) {
		String a,res;
		a="programming";
		res="";
		for(int i=0;i<a.length();i++) {
		char b=a.charAt(i);
		boolean flag=false;
		
		for(int j=0;j<res.length();j++) {
			if(b==res.charAt(j)) {
			 flag=true;
			 break;
			}	
		}
		if(!flag) {
			res+=b;
		}
		}
		System.out.println(res);

	}
}
