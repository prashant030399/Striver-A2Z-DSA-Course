import java.util.*;

class checkarraysortedbrute {

    public static int sample(int []a) {
    
        for(int i=1 ; i<= a.length -1 ; i++){
            if(a[i-1]<= a[i]){
 
            }
            else {
                return 0;
            } 
        }
        return 1;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int[] a = {3,5,7,8,9};

        checkarraysortedbrute x = new checkarraysortedbrute();
int result = x.sample(a);
System.out.println(result);

    }
}

  