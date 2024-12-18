import java.util.*;

class checkarraysortedoptimal {

    public static int sample(int []a) {
    
     for(int i=0;  i<=a.length -1 ;i++){
if(a[i]> a[i+1]) return 0;
     }
return 1 ;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int[] a = {3,5,7,8,4};

        checkarraysortedoptimal x = new checkarraysortedoptimal();
int result = x.sample(a);
System.out.println(result);

    }
}
