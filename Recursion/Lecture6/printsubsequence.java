import java.util.*;

class printsubsequence {

static  void print(int i, List<Integer> ds, int arr [], int n){

if(i==n){
    System.out.println(ds);

    // for printing the null 
    // if(ds.size() ==0){
    //     System.out.println("{}");
    // }

return ;
}

//take or pick the particular index into the subsequence 
ds.add(arr[i]);
print(i+1, ds, arr ,n);
//not pick the particular index into the subsequence
ds.remove(ds.size()-1);


//NOT PICK
print(i+1, ds,arr ,n);


}
    public static void main(String[] args) {
    
        int arr [] = {3,1,2};
        int n=arr.length ;

        List <Integer> ds =new ArrayList<> ();
       
        print(0,ds,arr,n);
        
    }

}