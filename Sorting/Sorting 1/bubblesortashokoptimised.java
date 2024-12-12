public class bubblesortashokoptimised {

    public static void main(String[] args) {
        int arr []= {2,4,7,9,4,5};
        int n = arr.length;

        for(int i=0; i<arr.length ; i++){
            int didswap =0;
            for(int j=0 ; j<arr.length - 1 -i ; j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didswap=1;
                }
            }
            if(didswap ==0){
                break;
            }
            System.out.println("runs");
        }
for(int i=0 ; i<arr.length; i++){
    System.out.print(arr[i] + " ");
}

    }

}

