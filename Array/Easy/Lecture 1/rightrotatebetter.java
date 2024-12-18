import java.util.*;

class rightrotatebetter {

public  static int []  rotate(int a[], int k){
    int n = a.length;
k = k%n;

    reverse(a,0,k);
    reverse(a,k+1,n-1);
    reverse(a,0,n-1);

    return a;
}

public static  void reverse(int a[],int start, int end){

while(start<=end){
    int temp = a[start];
    a[start] = a[end];
    a[end] = temp;
    start ++;
    end --;
}

}




    public static void main(String[] args) {
    int a[] = {1,2,3,4,5};
    int k=2 ;
    rightrotatebetter x = new rightrotatebetter();
int sample [] = x.rotate(a,k);
    System.out.println(Arrays.toString(sample));
    }

}
