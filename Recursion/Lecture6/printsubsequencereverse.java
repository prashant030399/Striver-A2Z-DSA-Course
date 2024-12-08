import java.util.*;

 class printsubsequencereverse {

    static void  printreverse(int i, int n  ,int  arr[], List <Integer> ds ){

if(i==n){
    System.out.println(ds);
    return;
}

printreverse(i+1,n,arr,ds);

ds.add(arr[i]);
printreverse(i+1,n,arr,ds);

ds.remove(ds.size() -1);

    }


public static void main(String[] args) {

    List <Integer> ds = new ArrayList <>();
    int arr [] = {3,1,2};
int n = arr.length;

    printreverse(0,n,arr,ds);
    
}

}