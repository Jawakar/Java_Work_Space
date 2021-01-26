package UniquePack;
import java.util.Scanner;
public class InToMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows and Columns should be the same inorder to do this InTo method"+"\n"+"Enter the values for rows and columns:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Enter the values:");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int leftDiagonal = 0;
		int rightDiagonal = 0;
		int decrementCount = col-1;
		for(int i=0; i<row; i++) {
			leftDiagonal+=arr[i][i];
		}
		for(int i=0; i<row; i++) {
			rightDiagonal+=arr[i][decrementCount];
			decrementCount--;
		}
		System.out.println("Sum of left diagonal: "+leftDiagonal+"\n"+"Sum of right diagonal: "+rightDiagonal);		
	}
}