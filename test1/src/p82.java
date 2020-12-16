public class p82 {
    public static void main(String[] args) {
int a[]={1,2,5,3,5,74};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }System.out.println("===========");
for(int min=0,max=a.length-1;min<max;min++,max--){
int temp=a[min];
a[min]=a[max];
a[max]=temp;

}
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
