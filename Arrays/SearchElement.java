import java.util.Scanner;
class Search {
    void searchElement(){
    int   arr[]={1,2,3,4,3};
        Scanner sc =new Scanner(System.in);
        int n =  sc.nextInt();
        boolean found =false;
        for(int  i =0;i<arr.length ;i ++){
            if(arr[i]== n){
                System.out.println(i);
               found =true;
                break;

            }


        }

if(!found){
    System.out.println(-1);
}


    }


}

public class SearchElement {
    public static void main(String[] args) {
        Search obj = new Search();
        obj.searchElement();


    }
}
