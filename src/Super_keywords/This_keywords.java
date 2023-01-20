package Super_keywords;

public class This_keywords {
	int  a=10;
	public void test () {
		int b=20;
		System.out.println(b);
		//now i want to print global variables from same class
		System.out.println(this.a);
	}

}
