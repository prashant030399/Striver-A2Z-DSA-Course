public class bubblesortashok {

    public static void main(String[] args) {
        int arr []= {2,4,7,9,4,5};
        int n = arr.length;

        for(int i=0; i<arr.length ; i++){
            for(int j=0 ; j<arr.length - 1 -i ; j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; 
        
                }
            }
        }
for(int i=0 ; i<arr.length; i++){
    System.out.print(arr[i] + " ");
}

    }

}
