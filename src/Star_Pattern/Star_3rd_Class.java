package Star_Pattern;

public class Star_3rd_Class {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==j && j==1) {
					System.out.print("@");
				}
				else if(i==j && j==4) {
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
