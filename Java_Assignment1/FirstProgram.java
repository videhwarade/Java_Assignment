//Q.1.a Write Java Programs to print the following patterns
//     * * * * *
//     * * * * *
//     * * * * * 

package pattern;

public class FirstProgram {

	public static void main(String[] args) {
		int i, j, rows = 3, columns = 5;
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				System.out.print(" * ");
			}
			System.out.println("  ");
		}

	}

}

//Output:-
//		*  *  *  *  *   
//  	*  *  *  *  *  
//  	*  *  *  *  *