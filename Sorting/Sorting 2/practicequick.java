import java.util.*;

class practicedquick {

static int partition(List<Integer> arr, int low, int high ){

int pivot = arr.get(low);
int i = low;
int j = high;

while( i<j){

while(arr.get(i)<= pivot && i<=high-1){
i++;
}

while(arr.get(j)>pivot && i>=low +1){
    j--;
}

if(i<j){
    int temp = arr.get(i);
 arr.set(i, arr.get(j));
 arr.set(j, temp);
}
}
    int temp = arr.get(low);
    arr.set(low,arr.get(j));
    arr.set(j,temp);
    return j;

}

static void qs(List<Integer>arr, int low, int high){
   if(low<high){
    int pIndex = partition(arr,low,high);
    qs(arr,low,pIndex - 1);
    qs(arr, pIndex + 1,high ); 
   }

}

public static List<Integer> quickSort(List<Integer> arr ){
qs(arr,0, arr.size()-1);
return arr;
}



}

public class practicequick {

public static void main(String[] args) {
    
    List<Integer>  arr = new  ArrayList<>();
arr = Arrays.asList(new Integer [] {4,2,5,6,2});

    int n = arr.size();

    arr = practicedquick.quickSort(arr);

    for(int i=0 ; i<n; i++){
        System.out.print(arr.get(i) + " ");
    }


}

}