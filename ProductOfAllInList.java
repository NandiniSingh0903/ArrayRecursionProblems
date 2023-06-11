public class ProductOfAllInList {
    static void product(int[] arr, int n, int prod){
        if(n<0){
            System.out.println(prod);
            return;
        }
        prod = prod * arr[n];
        product(arr, n-1, prod); 
    }

    public static void main(String[] args) {
        int arr[] = {4,1,5,10,7};
        product(arr, arr.length-1, 1); 
    }
}
