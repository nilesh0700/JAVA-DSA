public class selectionSort{
    public static void main(String[] args){

        int[] arr = {45,32,109,23,19,11,5,10};

        for(int i = 0; i < arr.length; i++){
            int smallest = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println(java.util.Arrays.toString(arr));
    }
}