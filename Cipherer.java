package ciphererApp;

class Cipherer {
	private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final int alphaLen = alphabet.length();
	
	public static String encrypt(String sentence, int cipherKey) {
		int key = Math.abs(cipherKey) % alphaLen;
		String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0,key);	
		//String shiftedAlphabet = alphabet.substring(key, alphaLen) + alphabet.substring(0,key); //previous line with alphaLen	

		int sentLen = sentence.length();
		StringBuilder sb = new StringBuilder();
		String s="";
		
		for (int i = 0; i < sentLen; i++) {

			Character c = sentence.charAt(i);
			int index = alphabet.indexOf(Character.toUpperCase(c));	
						
			if (Character.isLowerCase(c)) {
				if(index == -1) {
					s = " ";
				} else {
					s = shiftedAlphabet.charAt(index) + "";
				}
				sb.append(s.toLowerCase());
			} else {
				if(index == -1){
					s = " ";
				} else {
					s = shiftedAlphabet.charAt(index) + "";
				}
				sb.append(s);
			}
		}
		return sb.toString();
	}
}