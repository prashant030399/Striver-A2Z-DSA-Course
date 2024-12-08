import  java.util.*;

public class countcharall {
public static void main(String[] args) {
        
Scanner sc = new  Scanner (System.in);

String s = sc.nextLine();

//pre compute 
int hash [] =new int [256];
for(int i=0 ; i<s.length(); i++){
    char c = s.charAt(i);
    hash[c]++;
}

 int q=sc.nextInt();

 while(q-->0){

    char c = sc.next().charAt(0);

    //fetch
    System.out.println("Number of times "+ c + " comes is " +hash[c]);

 }

    }

}
