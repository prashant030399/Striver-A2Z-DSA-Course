import java.util.*;

import java.util.ArrayList;
import java.util.List;

class findsubsetonlyone {

boolean findSubset(int i, List <Integer> ds, int s, int sum, int arr [],int n){

if(i==n){

    //condition satisfied
    if(s==sum){
        System.out.println(ds);
        return true;
    } else {

        //condition not satisfied
        return false ;
    }
   
}

ds.add(arr[i]);
s += arr[i];

if(findSubset(i+1,ds,s,sum, arr,n)== true){
     return true;
}

ds.remove(ds.size()-1);
s -= arr[i];

//not pick
if(findSubset(i+1,ds,s,sum, arr,n) == true){
     return true ;
}
return false;

}   

public static void main(String[] args) {
   
    int arr [] = {1,2,1};
    int n= arr.length;
    int sum =2;
 List <Integer> ds = new ArrayList<>(); 


 findsubsetonlyone x = new findsubsetonlyone();
 
 x.findSubset(0,ds,0,sum,arr,n);

}

}
