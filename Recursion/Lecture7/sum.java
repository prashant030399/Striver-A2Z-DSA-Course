import java.util.*;



import java.util.ArrayList;
import java.util.List;

class sum {

static void findSubset(int i, List <Integer> ds, int s, int sum, int arr [],int n){

if(i==n){
    if(s==sum){
        System.out.println(ds);
    }
    return;
}

ds.add(arr[i]);
s += arr[i];
findSubset(i+1,ds,s,sum, arr,n);

ds.remove(ds.size()-1);
s -= arr[i];
findSubset(i+1,ds,s,sum, arr,n);

}

public static void main(String[] args) {
   
    int arr [] = {1,2,1};
    int n= arr.length;
    int sum =2;
 List <Integer> ds = new ArrayList<>(); 
 
 findSubset(0,ds,0,sum,arr,n);

}

}
