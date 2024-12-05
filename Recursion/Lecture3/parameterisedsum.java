import java.util.*;

class parameterisedsum {


    static void print(int i, int sum){

if(i<1) {
 System.out.print(sum); return ;
}

print(i-1 ,sum +i);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
print(n,0);



}
}