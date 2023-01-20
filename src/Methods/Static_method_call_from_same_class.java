package Methods;

public class Static_method_call_from_same_class {
	public static void main(String[] args) {//main method body open
		//we are calling static regualr method from same class
		electricity();
		moneyTransfer();
		recharge();
		
	}//main method close
	public static void moneyTransfer() {//m1 block is open(regular method 1)
		System.out.println("Hii");
		System.out.println("bye");
		System.out.println("How r u");
		
	}//m1 block close

	public static void recharge() {// regular method 2
		System.out.println("good mrng");
		System.out.println("Good afternoon");
		System.out.println("Good evening");
		System.out.println("Good night");
		
	}
	public static void electricity() {
		System.out.println("phone bill paid");
		System.out.println("AC bill is paid");
		System.out.println("cooler bill is paid");




	}

}
