package selfevaluation;

public class Array {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6};
        int size = a.length;
        int k =5;
        int sum;
        for (int i = 0; i < size; i++) {
            for(int j = i+1;j<size;j++){
                sum =a[i]+a[j];
                if(sum%k==0){
                   System.out.println("["+a[i]+" "+a[j]+"]");
                }
            }

        }
    }
}
