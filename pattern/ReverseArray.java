package pattern;

import java.util.Arrays;

public class ReverseArray {
    static void reversearr(int arr[]) {
        int i,temp;
        for(i=0;i<arr.length /2;i++) {
            temp = arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int arr2[]={20,40,60,80};
        reversearr(arr);
        revarr(arr2);
    }

    private static void revarr(int arr2[]) {
            int j = arr2.length  - 1;
            for (int i=j;i>=0;i--){
                System.out.println(arr2[i]);

            }
        }

}
