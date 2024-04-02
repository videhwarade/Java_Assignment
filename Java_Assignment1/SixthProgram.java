//Q.1.f
//		* * * * * *  
//		 * * * * *  
//		  * * * *  
//		   * * *  
//		    * *  
//		     * 

package pattern;

public class SixthProgram {

	public static void main(String[] args) {
		int i, j, k, rows = 6, columns = 6;
		for (i = 0; i < columns; i++) {
			for (j = rows; j > columns - i; j--) {
				System.out.print(" ");
			}
			for (k = 0; k < rows - i; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
//Output:- 
//		* * * * * *  
//		 * * * * *  
//		  * * * *  
//		   * * *  
//		    * *  
//		     *  
