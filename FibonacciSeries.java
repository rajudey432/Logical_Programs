
public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 10; // limit of the series
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Series up to " + limit + ": ");
        while (firstTerm <= limit) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}