package Arrays;

public class Veer {
public static void main(String[] args) {
	int[] i=new int [5];
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
	i[4]=50;
	//print index data
		//system.out.println(i[1]);
		//if we try to fetch data which is not there then we will get AIOOBE
		//system.out.println(i[6]);
		//print entire data
		for(int j=0;j<=4;j++) {
			System.out.println(i[j]);
	}
}
}

