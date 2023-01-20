package Conditional_Statements;

public class Switch {
		public static void main(String[] args) {
		switch("Idle") {//output of expression
			
			
			case "Idle":{//false
				System.out.println("on monday");
				break;//jvm stops execution
				
			}
			case "Dosa":{//true
				System.out.println("on thursday");
				break;
			}
			case "Utappa":{
				System.out.println("on saturday");
				break;
			}
			default:{
				System.out.println("No chatney");
			}
		}
		}
}
