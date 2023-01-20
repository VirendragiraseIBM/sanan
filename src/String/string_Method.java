package String;

public class string_Method {
	public static void main(String[] args) {
		String s1="velocity";
		String s2="VELOCITY";
		String s3="city";
		//length()
		System.out.println(s1.length());//8
		//toUppercase()
		System.out.println(s1.toUpperCase());//VELOCITY
		//toLowercase()
		System.out.println(s2.toLowerCase());
		//equals()
		System.out.println(s1.equals(s2));//false
		//equalsignorecase()
		System.out.println(s1.equalsIgnoreCase(s2));
		//contins()
		System.out.println(s1.contains(s3));//true
		System.out.println(s2.contains(s3));//false
		//charAT()
		System.out.println(s1.charAt(7));//y
		//indexof()
		System.out.println(s1.indexOf('y'));//7
		//concat()
		System.out.println(s1.concat(s3));//velocitycity
		//SubString()
		System.out.println(s1.substring(4));//city
		//Startwith()
		System.out.println(s1.startsWith("ve"));//true
		//endswith()
		System.out.println(s1.endsWith("ty"));//true
			
		
	}

}
