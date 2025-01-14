public class practice {

    public static void main(String args []){
    
    int a[]= {3,4,6,7,9,12,16,17};
    int target = 6;
    int low =0;
     int high = a.length -1 ;
      
     while(low <= high){

        int mid = (low+ high)/2;

        if(a[mid] < target){
low = mid + 1;
        }
        else if(a[mid] > target){
            high = mid -1 ;
        }
        else{
            System.out.print(mid);
            break;
        }     
     }
    
    
    
    }
    
    }