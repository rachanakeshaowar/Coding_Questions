class Addition{
    void sumOfArrays() {
        int arr[] = {2, 5, 6, 7};
int sum =0;
        for (int i = 0; i < arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }
}
 public class ArrayAddition {
     public static void main(String[] args) {


         Addition obj = new Addition();
         obj.sumOfArrays();

     }
 }

