package by.htp.lesson9.homework.palindrom;
//check the number is an palindrom
public class Palindrom {

	public static void main(String[] args) {
		int a = 1;
		int b = 23;
		int c = 121;
		int d = 1232;
		int e = 375303573;
		String aString = Integer.toString(a);
		String bString = b + "";
		String cString = String.valueOf(c);
	    
		String dString = Integer.toString(d);
		String eString = Integer.toString(e);
		String[] mass = new String[5];
		mass[0] = aString;
		mass[1] = bString;
		mass[2] = cString;
		mass[3] = dString;
		mass[4] = eString;
		for(int i =0 ; i<mass.length;i++){
			StringBuilder s =new StringBuilder();
			s=s.append(mass[i]);
			s.reverse().toString();
			boolean isPalindrom= mass[i].equals(s);
		System.out.println(mass[i]+ " is palidrom "+isPalindrom);
		}
	}

}
