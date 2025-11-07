public class occurence {
    public static void main(String[] args) {
        String input = "Ajit Gandole".toLowerCase(); // Input string
        char[] ch = input.toCharArray();
        boolean[] counted = new boolean[ch.length]; // To mark counted chars
        for (int i = 0; i < ch.length; i++) {
            
        	if (counted[i]) continue; // skip if already counted
            int count = 1; // count for current character
            
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    counted[j] = true; // mark duplicate as counted
                }
            }
            System.out.println(ch[i] + " : " + count);
        }
    }
}