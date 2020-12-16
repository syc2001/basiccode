public class th2 {
    public static void main(String[] args) {
        int a[] = {1, 25, 35, 35, 3, 341, 5, 46, 33, 48, 97, 66};
      int x=0,y=0;
        for (int i = 0;i < a.length; i++) {
            if (a[i] % 2 != 0) {
                x++;
            } else y++;
        }//x为奇数个数，y为偶数个数
        System.out.println("奇数个数为" +x +"偶数个数为"+y);
    }
}
