import java.util.Arrays;
import java.util.Scanner;

public class HiQCodeTest {
	
	public static void main(String[] args) {
		int[][] arr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the room");
		while(scan.hasNext()) {
			int rows = scan.nextInt();
			int columns = scan.nextInt();
			arr = new int[rows][columns];
			System.out.println("Du angav rummets storlek till: " + rows + " x " + columns);
			System.out.println("Ange start-positionen på bilen");
			
			int start = scan.nextInt();
			int start2 = scan.nextInt();
			String heading = scan.next();
			System.out.println("Vart ska bilen ta vägen?");
			scan.nextLine();
			
			arr[start][start2] = 1;
			String input = scan.nextLine();
			try {
				for(int i = 0; i < input.length(); i++) {
					if(input.charAt(i) == 'B') {
						start = start+1;
						if(arr[start][start2] == 1) {
							arr[start][start2] = 1;
						}else {
							arr[start][start2] = 2;	
						}
					}
					
					else if(input.charAt(i) == 'F') {
						start = start-1;
						if(arr[start][start2] == 1) {
							arr[start][start2] = 1;
						}else {
							arr[start][start2] = 2;	
						}
					}
					
					else if(input.charAt(i) == 'L') {
						start2 = start2-1;
						if(arr[start][start2] == 1) {
							arr[start][start2] = 1;
						}else {
							arr[start][start2] = 2;
						}
					}
					
					else if(input.charAt(i) == 'R') {
						start2 = start2+1;
						if(arr[start][start2] == 1) {
							arr[start][start2] = 1;
						}else {
							arr[start][start2] = 2;
						}
					}
					
			}
				System.out.println(Arrays.deepToString(arr).replaceAll("], ", "]\n"));
				System.out.println("\n\nDu klarade dig!");

			}
			catch(ArrayIndexOutOfBoundsException exception) {
			    System.out.println("Du förlorade");
			}
		}
		
		

		scan.close();
  }

}
