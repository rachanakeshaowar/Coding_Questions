public class BubbleSort {
    // we do certain number of passes in every pass ,we compare adjacent elements and swap swap them if
    // they are not in correct order
    // In every iteration the largest number in the part of array
    // to be processed gets its correct possition
    static void bubbleSort(int [] a){
        int n=a.length ;
        // n-1 iterartions /passes
        for(int i=0;i<n-1;i++){
            boolean flag = false ;// has any swapping
            for(int j=0;j<n-i-1;j++){
                // last i elements are already at correct sorted positions so no need to check them
                if(a[j]>a[j+1]){
                    //swap
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true; // some swaps happened
                }

            }
            if(flag==false) // have any swaps happened
                 return;
        }
    }

    public static void main(String[] args) {
        int[]a ={0,1,2,3,7,6,8};
        int n=a.length ;
        bubbleSort(a);
        for(int i :a){ // for each loop
            System.out.println(i+" ");
        }
    }
}
// all case complexity is n^2
// how to optimize our array if we have nearly sorted array in input
//we if check swaps are performed in current iteration or not
// if no swaps then no need to iterate again
// two types of sorts
// stable and unstable sort
// Here if we have duplicate values in array input the stable
//  stable sort will sort or place 1st duplicate element before second duplicate element
// and in unstable sort 2nd duplicate element can be placed before 1st duplicate
// order of apperiance of duplicate element is same as array input
// bubble sort is stable algorithm
// space  complexity 0(1) and time 0(n^2)
// bubble sort obeys inplace algorithm
// best case--> 0(n)
// worst case0(n^2)
// average case0(n^2)


