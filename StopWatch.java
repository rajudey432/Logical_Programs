import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to start the stopwatch.");
        scanner.nextLine();
        long startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started.");
        System.out.println("Press enter to stop the stopwatch.");
        scanner.nextLine();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Stopwatch stopped.");
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
    }
}