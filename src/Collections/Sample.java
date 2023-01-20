package Collections;

public class Sample {
	public static void main(String[] args) {
		String ar[]=new String [4];
		ar[0]="Donkey";
		ar[1]="Monkey";
		ar[2]="Rinky";
		ar[3]="Anky";
		//ar[4]="abc";//AIOOBE
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);//there is no data but stil we are trying to fetch so we will get AIOOBE 
		
		
		
		
	}

}
