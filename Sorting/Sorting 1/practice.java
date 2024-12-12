import java.util.*;

class practice {

static int[] bubble(int arr []){

    int n = arr.length;

 for(int i=0 ; i<=n-2 ; i++){
    int min = i; 
    for(int j=i ; j<=n-1 ; j++){
        if(arr[j]< arr[min]){
min = j;
        }
    }
    int temp = arr[i];
    arr[i] =  arr[min];
    arr[min] = temp;
 }
    return arr;
    
}


public static void main(String[] args) {
    
    int arr [] = { 3,5,2,6,7,8};

    int bubblesorted [] = bubble(arr);

    System.out.println(Arrays.toString(bubblesorted));

}


}