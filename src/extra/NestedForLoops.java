package extra;

public class NestedForLoops {
public static void main(String[] args) {
//step1
	 for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			System.out.println(i+""+j);
		}
	}
//step 2
	 for(int i=0; i<9; i+=3) {
		 for(int j=1; j<4; j++) {
			 System.out.print(j+i);
		 }
		 System.out.println();
	 }
//step3
	 for(int y=0; y<100; y+=10) {
		 for(int x=1; x<11; x++) {
			 System.out.print(x+y+" ");
		 }
		 System.out.println();
	 }
	
//step 4
	 
	 for(int i=0; i<6; i++) {
		 for(int j=0; j<i; j++) {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
//Bonus
	 for(int i=0; i>-101; i--) {
		 System.out.println(i+(100));
	 }
	 
}

}

