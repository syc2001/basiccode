public class th1 {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int num) {
        if (num == 1)
            return 1;
        return mum(num) + sum(num - 1);
    }

    public static int mum(int num) {
        if (num == 1) {
            return 1;
        }

        return num * mum(num - 1);
    }
}
