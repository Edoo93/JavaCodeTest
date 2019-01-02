import java.util.Arrays;
import java.util.Scanner;

public class HiQCodeTest {
	
	public static void main(String[] args) {
		int[][] arr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ange rummets storlek");
		while(scan.hasNext()) {
			int rows = scan.nextInt();
			int columns = scan.nextInt();
			arr = new int[rows][columns];
			System.out.println("Du angav rummets storlek till: " + rows + " x " + columns);
			System.out.println("Ange start-positionen på bilen");
			
			int startPosRow = scan.nextInt();
			int startPosCol = scan.nextInt();
			System.out.println("N för North, S för South, E för East, W för West");
			String heading = scan.next();
			System.out.println("Vart ska bilen ta vägen?");
			scan.nextLine();
			
			//Ge värdet 1 på startpositionen i den tvådimensionella arrayen
			//Som sedan inte ändras, för att lättare ha koll på vart bilen startade
			arr[startPosRow][startPosCol] = 1;
			String input = scan.nextLine();
			try {
				for(int i = 0; i < input.length(); i++) {
					if(input.charAt(i) == 'B') {
						startPosRow = startPosRow+1;
						if(arr[startPosRow][startPosCol] == 1) {
							arr[startPosRow][startPosCol] = 1;
						}else {
							arr[startPosRow][startPosCol] = 2;	
						}
					}
					
					else if(input.charAt(i) == 'F') {
						startPosRow = startPosRow-1;
						if(arr[startPosRow][startPosCol] == 1) {
							arr[startPosRow][startPosCol] = 1;
						}else {
							arr[startPosRow][startPosCol] = 2;	
						}
					}
					
					else if(input.charAt(i) == 'L') {
						startPosCol = startPosCol-1;
						if(arr[startPosRow][startPosCol] == 1) {
							arr[startPosRow][startPosCol] = 1;
						}else {
							arr[startPosRow][startPosCol] = 2;
						}
					}
					
					else if(input.charAt(i) == 'R') {
						startPosCol = startPosCol+1;
						if(arr[startPosRow][startPosCol] == 1) {
							arr[startPosRow][startPosCol] = 1;
						}else {
							arr[startPosRow][startPosCol] = 2;
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
