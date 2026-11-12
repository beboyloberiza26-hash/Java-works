
public class Problem_1_CCPRGG2L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] seats = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12}
	        };
	        System.out.println("CLASSROOM SEATING CHART");
	        for (int i = 0; i < seats.length; i++) {
	            for (int j = 0; j < seats[i].length; j++) {
	                System.out.print(seats[i][j] + " ");
	            }
	            System.out.println();   
	        }
	    }
	}