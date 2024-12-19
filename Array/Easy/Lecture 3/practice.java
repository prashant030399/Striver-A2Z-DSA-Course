public class practice {

    public static void main(String[] args) {
        
int a [] = {3,1,1,1,3,1,1,1,1};
int count=0;
int max =0;

for(int i=0 ; i<=a.length -1 ; i++){
    if(a[i] == 1){
count ++;
if (max<count){
    max = count;
}
if(a[i] != 1){
    count =0;
    break;
}
    }
}

System.out.print(max);


    }
}