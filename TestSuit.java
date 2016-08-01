public class TestSuit {
    private static int num = 0;
    private static int result = 0;
    private static void equal(int result, int expect) {
        if(result == expect) {
            System.out.printf("期望是:%d，实际是：%d. 成功！\n", expect, result);
        } else {
            System.out.printf("期望是:%d，实际是：%d. 失败！\n", expect, result);
        }
    }
    public static void testCase1() {
        num = 1;
        result = 1;
        System.out.printf("testCase1, %d的阶乘: ", num);
        equal(result, Factorials.getFactorials(num));
    }
    public static void testCase2() {
        num = 31;
        result = 738197504;
        System.out.printf("testCase2, %d的阶乘: ", num);
        equal(result, Factorials.getFactorials(num));
    }
    public static void testCase3() {
        num = 0;
        result = 1;
        System.out.printf("testCase3, %d的阶乘: ", num);
        equal(result, Factorials.getFactorials(num));
    }
    public static void main(String args[]) {
        int num = 10;
        if(1 == args.length) {
            num = Integer.parseInt(args[0]);
            System.out.printf("%d的阶乘是:%d\n", num, Factorials.getFactorials(num));
        } else {
            testCase1();
            testCase2();
            testCase3();
        }
    }
}
