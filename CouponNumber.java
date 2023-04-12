import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CouponNumber {

    // Function to generate a random number between 1 and n
    public static int generateRandom(int n) {
        Random rand = new Random();
        return rand.nextInt(n) + 1;
    }

    // Function to generate distinct coupon numbers
    public static int[] generateDistinctCoupons(int n) {
        Set<Integer> set = new HashSet<>();
        int[] coupons = new int[n];
        int count = 0;

        while (count < n) {
            int coupon = generateRandom(n);
            if (!set.contains(coupon)) {
                set.add(coupon);
                coupons[count] = coupon;
                count++;
            }
        }

        return coupons;
    }

    // Function to find the total random number needed to have all distinct coupon numbers
    public static int findTotalRandomNumber(int n) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        while (set.size() < n) {
            int coupon = generateRandom(n);
            set.add(coupon);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] coupons = generateDistinctCoupons(n);
        System.out.println("Distinct coupon numbers generated:");
        for (int coupon : coupons) {
            System.out.print(coupon + " ");
        }
        System.out.println();
        int totalRandomNumber = findTotalRandomNumber(n);
        System.out.println("Total random numbers needed to have all distinct numbers: " + totalRandomNumber);
    }
}