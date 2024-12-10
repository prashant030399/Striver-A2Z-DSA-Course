import java.util.*;

class bubblesort {

      static int [] sort(int arr []){

        int n = arr.length;

for(int i=n-1 ; i>=0 ; i--){
    for(int j=0 ; j<i-1 ; j++){
        if(arr[j]> arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
return arr;
      } 



      public static  void main (String args []){  
        int arr [] = {3,6,2,4,1,8,89,11};
int sortedarray [] = sort(arr);
System.out.println(Arrays.toString(sortedarray));


      } 

} 