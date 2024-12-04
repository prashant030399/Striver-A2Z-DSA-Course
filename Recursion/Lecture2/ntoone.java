import java.util.Scanner;

class ntoone {
 

static void print(int i, int n){
 
    if(i < 1 ) return;
    System.out.println(i);
    print(i-1,n);

}

public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    print(n,n);

}
}
