
import java.util.*;

class insertionsort {

static int [] sort( int arr []){

    int n = arr.length;

for(int i=0 ; i<=n-1 ; i++){
    int j= i;
    while(j>0 && arr[j - 1]>arr[j]){
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
    }
}

return arr ;

}


public  static void  main(String args []){

int arr[] = {3,4,5,62,8,1,9};

int sortedarray [] = sort(arr);

System.out.println(Arrays.toString(sortedarray));

}

}
