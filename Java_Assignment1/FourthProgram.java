//Q.1.d 
//		 *  *  *  *  *  *   
//		 *  *  *  *  *   
//		 *  *  *  *   
//		 *  *  *   
//		 *  *   
//		 *

package pattern;

public class FourthProgram {

	public static void main(String[] args) {
		int i, j, columns = 6;
		for (i = 0; i < columns; i++) {
			for (j = 0; j < columns - i; j++) {
				System.out.print(" * ");
			}
			System.out.println("  ");
		}
	}
}

//Output:- 
//		*  *  *  *  *  *   
//		*  *  *  *  *   
//		*  *  *  *   
//		*  *  *   
//		*  *   
//		*