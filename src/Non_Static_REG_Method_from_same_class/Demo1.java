package Non_Static_REG_Method_from_same_class;

public class Demo1 {
public static void main(String[] args) {
    t1();	
	//create object
	Demo1 d=new Demo1();
	d.t2();
	
}
public static void t1() {
	System.out.println("i am static t1");

}
public void t2() {
	System.out.println("i am non static t2");

}
}
