public class Factorials {
    public static int getFactorials(int num) {
        if(1 >= num) {
            return 1;
        }
        return num * getFactorials(num - 1);
    }

    public static void main(String args[]) {
        int num = 10;
        if(1 == args.length) {
            num = Integer.parseInt(args[0]);
        }
        System.out.printf("%d的阶乘是:%d\n", num, getFactorials(num));
    }
}
