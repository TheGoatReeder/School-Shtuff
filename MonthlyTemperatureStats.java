import java.util.Scanner;

public class MonthlyTemperatureStats {
    public static void main(String[] args) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        double[] temperatures = {
            45.2, 48.6, 55.1, 62.3, 70.5, 78.9,
            83.4, 82.1, 75.0, 64.3, 54.8, 47.6
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month name (e.g., March) or type 'year': ");
        String input = scanner.nextLine().trim();

        if (input.equalsIgnoreCase("year")) {
            double total = 0;
            double max = temperatures[0];
            double min = temperatures[0];
            int maxIndex = 0;
            int minIndex = 0;

            System.out.println("\n📅 Monthly Temperatures:");
            for (int i = 0; i < months.length; i++) {
                System.out.printf("%-10s: %.1f°F%n", months[i], temperatures[i]);
                total += temperatures[i];
                if (temperatures[i] > max) {
                    max = temperatures[i];
                    maxIndex = i;
                }
                if (temperatures[i] < min) {
                    min = temperatures[i];
                    minIndex = i;
                }
            }

            double average = total / temperatures.length;
            System.out.printf("%nYearly Average: %.2f°F%n", average);
            System.out.printf("Highest Month: %s (%.1f°F)%n", months[maxIndex], max);
            System.out.printf("Lowest Month: %s (%.1f°F)%n", months[minIndex], min);

        } else {
            boolean found = false;
            for (int i = 0; i < months.length; i++) {
                if (months[i].equalsIgnoreCase(input)) {
                    System.out.printf("%nTemperature for %s: %.1f°F%n", months[i], temperatures[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Invalid month entered.");
            }
        }

        scanner.close();
    }
}