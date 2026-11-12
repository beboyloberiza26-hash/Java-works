
public class Problem_2_CCPRGG2L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] sales = {
	            {12000, 15000, 13000, 16000}, 
	            {10000, 11000, 12000, 13000},  
	            {18000, 17000, 16000, 19000}   
	        };

	        double highestAverage = 0;
	        int bestBranch = 0;

	        for (int i = 0; i < sales.length; i++) {
	            double total = 0;

	            for (int j = 0; j < sales[i].length; j++) {
	                total += sales[i][j];
	            }

	            double average = total / sales[i].length;

	            System.out.printf("Branch %d: Total = %.0f, Average = %.2f%n",
	                              (i + 1), total, average);

	            if (average > highestAverage) {
	                highestAverage = average;
	                bestBranch = i + 1;
	            }
	        }

	        System.out.println("Highest average sales: Branch " + bestBranch);
	    }
	}