

class basicrecursion {

 static int c=0;
 static void print() {

    if(c==3) return ;
    System.out.println(c);

    c++;
    print();
 }


 public static void main(String args []){

        print();

    } 
}

