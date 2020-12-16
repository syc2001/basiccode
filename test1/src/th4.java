import java.util.Scanner;

public class th4 {
    public static void main(String[] args) {
        int a[]= {1,35,35,4,89,64,464,68,54,66,88,46,846,84,8,7,55};int max=a[0];
        int min=a[0];int sum=0;
        for (int i = 0; i < a.length; i++) {

            if (max<a[i]){
                max=a[i];
            }
            if (min>a[i])
            {
                min=a[i];
            }

            sum=sum+a[i];
        }
        System.out.println("最大值是"+max+"最小值是"+min+"和为"+sum);
    }
}
