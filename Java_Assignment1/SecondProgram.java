//Q.1.b 
//		*  *  *  *  * 
//		*           * 
//		*  *  *  *  * 


package pattern;

public class SecondProgram {

	public static void main(String[] args) {
		int i,j,rows=3,columns=5;
		for(i=1; i<=rows; i++)
		{
			for(j=1; j<=columns; j++)
			{
				if(i==1 || i==rows || j==1 || j==columns)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}

//Output:-
//			*  *  *  *  * 
//			*           * 
//			*  *  *  *  * 
