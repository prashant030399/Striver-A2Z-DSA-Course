import java.util.*;

import java.util.List;
import java.util.ArrayList;

class practice {

boolean printsum(int i, int n, int arr [],List<Integer> ds , int s , int sum){

if(i==n){
    if(s == sum  ){
        System.out.println(ds);
return true;

    } 
    else {
    return false;
}}

ds.add(arr[i]);
s += arr[i];
if(printsum(i+1,n,arr,ds,s,sum)== true){
    return true;
}

ds.remove(ds.size()-1);
 s -= arr[i];
if(printsum(i+1,n,arr,ds,s,sum)== true){
    return true;
}
return false;
}


public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

int arr [] = {2,3,4,5};
int n = arr.length;
int sum = 7 ;
List <Integer> ds = new ArrayList<>();
practice x = new practice();

x.printsum(0,n,arr,ds,0,sum);

}

}