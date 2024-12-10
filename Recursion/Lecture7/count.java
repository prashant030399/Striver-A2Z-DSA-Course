import java.util.*;

import java.util.ArrayList;
import java.util.List;

class count {

static int  findSubset(int i, int s, int sum, int arr [],int n){

if(i==n){

    //condition satisfied
    if(s==sum)    return 1;
     
        //condition not satisfied 
        return 0 ;
    
   
}


s += arr[i];

int l =findSubset(i+1,s,sum, arr,n)     ;

s -= arr[i];
int r  = findSubset(i+1,s,sum, arr,n)  ;
    

return l+r ;

}   

public static void main(String[] args) {
   
    int arr [] = {1,2,1,2};
    int n= arr.length;
    int sum =2;
  

System.out.println(findSubset(0,0,sum,arr,n));
 


}

}
 