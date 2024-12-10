import java.util.*;

class selectionsort {

static int [] sort( int arr []){

    int n = arr.length;

for(int i=0; i<=n-2  ; i++){
int min = i ;
    for(int j=i  ; j<=n-1 ; j++){
if(arr[j]<arr[min]){
    min =j;
}
    }

int temp = arr[i];
arr[i] =  arr[min];
arr[min] = temp;
    
}

return arr ;

}


public  static void  main(String args []){

int arr[] = {3,4,5,62,8,1,9};

int sortedarray [] = sort(arr);

System.out.println(Arrays.toString(sortedarray));

}

}