package DynamicProgrammingLeetCodeSeries;

public class Leetcode343IntegerBreakMedium {

    public static void main(String[] args) {
        Leetcode343IntegerBreakMedium leetcode343IntegerBreakMedium= new Leetcode343IntegerBreakMedium();
        System.out.println(leetcode343IntegerBreakMedium.integerBreak(10));
    }

    public int integerBreak(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int result = 1;
        while (n > 4) {
            result *= 3;
            n -= 3;
        }
        result *= n;
        return result;

//        if (n <= 1) {
//            return 0;
//        }
//        if (n == 2) {
//            return 1;
//        }
//        if (n == 3) {
//            return 2;
//        }
//        int quotient = n / 3;
//        int remainder = n % 3;
//        if (remainder == 0) {
//            return (int) Math.pow(3, quotient);3
//        } else if (remainder == 1) {
//            return (int) (Math.pow(3, quotient - 1) * 4);1
//        } else {
//            return (int) (Math.pow(3, quotient) * 2);
//        }
//    }
    }

}
