package Non_Static_REG_Method_from_same_class;

public class Demo {
	public static void main(String[] args) {
		//create object of class
		Demo d=new Demo ();
		d.m3();
		d.m4();
	}
public static void m3() {
	System.out.println("I am from NSRM m3");

}
public static void m4() {
	System.out.println("i am from NSRM M4");
}
}
