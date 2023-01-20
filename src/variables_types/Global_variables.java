package variables_types;

public class Global_variables {
	static int j=25;//static global variables
	int i=20;//non-static global variables
	public static void main(String[] args) {
		System.out.println(j);
	   Global_variables g=new Global_variables();//object creation
				System.out.println(g.i);
	}
	
		
	}


