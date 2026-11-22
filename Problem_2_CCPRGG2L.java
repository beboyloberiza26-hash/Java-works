import java.util.Scanner;
public class Problem_2_CCPRGG2L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double[][] sales = new double[3][4];

        for (int i = 0; i < sales.length; i++) {
            System.out.println("Enter Sales for Branch " + (i + 1) + ":");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print("Sales " + (j + 1) + ": ");
                sales[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n       SALES REPORT");
        System.out.printf("%-12s%12s%12s%12s%12s%n", "Branch", "Sales 1", "Sales 2", "Sales 3", "Sales 4");
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-12s", "Branch " + (i + 1));
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%12.0f", sales[i][j]);
            }
            System.out.println();
        }

        double highestAverage = 0;
        int bestBranch = 0;
        System.out.println();
        for (int i = 0; i < sales.length; i++) {
            double total = 0;
            for (int j = 0; j < sales[i].length; j++) total += sales[i][j];
            double average = total / sales[i].length;
            System.out.printf("Branch %d: Total = %.0f, Average = %.2f%n", (i + 1), total, average);
            if (average > highestAverage) {
                highestAverage = average;
                bestBranch = i + 1;
            }
        }
        System.out.println("\nHighest Average Sales: Branch " + bestBranch);
        sc.close();
    }
}