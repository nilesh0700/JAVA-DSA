/* Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]. */





// import java.util.*;
// public class shuffleTheArray{
//     public static void main(String[] args){

//         int[] nums = {2,5,1,3,4,7};
//         int n = 3;
//         int x = 0;
//         int mid = n;
//         int a = 0;
//         int[] arr = new int[nums.length]; 
//             for(int i = 0; i < n ; i++ ){
//                 for(int j = n; j < nums.length -1; j++){
//                     if(a < arr.length){
//                     arr[a] = nums[x];
//                     a++;
//                     x++;
//                     arr[a] = nums[mid];
//                     a++;
//                     mid++;
//                         }
                 
//                 }
//             }

        // while(a < arr.length){
        //     arr[a] = nums[x];
        //     a++;
        //     x++;
        //     arr[a] = nums[mid];
        //     a++;
        //     mid++;
        // }

//         System.out.println(java.util.Arrays.toString(arr));

//     }
// }

import java.util.*;
public class shuffleTheArray{
    public static void main(String[] args){

        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int x = 0;
        int mid = n;
        int a = 0;

        // for(int i = 0; i < n; i++){
        //     for(int j = n; j < nums.length; j++){
        //         if(a < nums.length){
        //             nums[a] = nums[x];
        //             a++;
        //             x++;
        //             nums[a] = nums[mid];
        //             a++;
        //             mid++;
        //         }
        //     }

        // }   


        while(a< nums.length){
            nums[a] = nums[x];
            a++;
            x++;
            nums[a] = nums[mid];
            a++;
            mid++;
        }
        System.out.println(java.util.Arrays.toString(nums));     
    }
}