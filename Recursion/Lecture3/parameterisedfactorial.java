import java.util.*;

class parameterisedfactorial {


    static void print (int i,int fact){

        if(i<1 ){
System.out.println(fact);
            return;
        } 
print(i-1, fact*i );
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
print(n,1);

}



}

