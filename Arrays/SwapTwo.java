import java.util.Scanner ;
public class SwapTwo {
    static void WithoutTemp(int a, int b){

        System.out.println("original values before swapping :");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
       a= a+b;
       b=a-b;
       a=a-b;

        System.out.println(" values after swapping :");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
   static void swap(int a,int b){
       System.out.println("original values before swapping :");
       System.out.println("a:"+a);
       System.out.println("b:"+b);
       int temp =a;
       a=b;
       b=temp;
       System.out.println(" values after swapping :");
       System.out.println("a:"+a);
       System.out.println("b:"+b);
   }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        WithoutTemp(a,b);
    }

}
