public class th3 {
    public static void main(String[] args) {
        int a[]={1,3,4,5,0,0,6,6,0,5,4,6,48,80,4,0,1};
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=0){
                int b[]={a[i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.print(b[j]+",");
                }
            }
        }
    }

}
