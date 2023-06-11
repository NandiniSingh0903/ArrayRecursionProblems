public class HighestElementInArray {
    static void highestElement(int[] arr, int i, int n, int temp){
        if(i==n){
            System.out.println("Highest Element: "+temp);
            return;
        }
        if(arr[i]>temp){
            temp = arr[i];
        }
        highestElement(arr, i+1, n, temp);
    }
    public static void main(String[] args) {
        int arr[] = {10,70,5,90,84};
        highestElement(arr, 0, arr.length, arr[0]);
    }
}
