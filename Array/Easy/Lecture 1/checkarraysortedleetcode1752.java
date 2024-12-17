import java.util.*;

class checkarraysortedleetcode1752 {

    public static boolean sample(int []a) {
    
        int count =0;
    for(int i=0 ; i<=a.length -1 ; i++){
      if(a[i] > a[(i+1)%a.length]){
        count ++;
      }
      if(count >1){
        return false ;
      }

    }
return true ;
     }
     

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int[] a = {3,4,5,1,2};

        checkarraysortedleetcode1752 x = new checkarraysortedleetcode1752();
boolean result = x.sample(a);
System.out.println(result);

    }
}

