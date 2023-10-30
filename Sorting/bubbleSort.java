public class bubbleSort{
    public static void main(String[]nargs){


        int[] arr = {45,32,109,23,19,11,5,10};

        for(int i = 0; i < arr.length -1; i++){
            for(int j = 0; j <arr.length -1 -i; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            //  for(int i = 0; i < arr.length; i++){
            //     System.out.print(arr[i] + " ");
            //  }   

            System.out.println(java.util.Arrays.toString(arr));

    }
}