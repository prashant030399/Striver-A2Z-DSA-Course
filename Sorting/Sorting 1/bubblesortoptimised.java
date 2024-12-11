import java.util.*;

class   bubblesortoptimised {

      static int [] sort(int arr []){

        int n = arr.length;

for(int i=n-1 ; i>=0 ; i--){
    int didSwap =0;
    for(int j=0 ; j<i-1 ; j++){
        if(arr[j]> arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            didSwap=1;
        }
    }
    if(didSwap == 0){
         break;
    }
    System.out.println("runs");
}
return arr;
      } 



      public static  void main (String args []){  
        int arr [] = {1,2,5,8,9};
int sortedarray [] = sort(arr);
System.out.println(Arrays.toString(sortedarray));


      } 

}
