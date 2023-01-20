package Constructors;

public class Gun1 {
	String gunName;
	int noofBullets;
	
	public Gun1 (String gunName,int noofBullets) {
		this.gunName=gunName;
		this.noofBullets=noofBullets;
	}
	//Non Static Method
	public void shoot() {
		for (int i=1;i<=noofBullets;i++) {
			System.out.println("Dishum");
			
		}
	}

}
