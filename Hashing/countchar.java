import java.util.*;

public class countchar {

public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    
    String s = sc.nextLine();

    int hash [] = new int[26];
    for(int i=0 ; i<s.length() ; i++){
        char c = s.charAt(i);
        hash[c- 'a']++ ;
    }

    int q =sc.nextInt();

    while(q-- >0){
char c = sc.next().charAt(0);
System.out.println(hash[c - 'a']);
 }

}

}



    
