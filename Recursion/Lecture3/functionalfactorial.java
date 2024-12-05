import java.util.*;

class functionalfactorial {

static int print(int n){

    if(n==1) return 1;
if(n==0) return 0;
    return n * print(n-1);

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println(print(n));

}



}

