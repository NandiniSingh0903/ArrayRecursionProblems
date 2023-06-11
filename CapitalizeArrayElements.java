public class CapitalizeArrayElements {
    static void capitalize(String[] arr, int i, int n, String temp[]){
        if(i==n){
            printArray(temp);
            return;
        }

        temp[i] = arr[i].toUpperCase();
        capitalize(arr, (i+1), n, temp);
    }

    static void printArray(String temp[]){
        System.out.println("Capitalized Array: ");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }

    public static void main(String[] args) {
        String arr[] = {"foo", "bar", "world", "moo"};
        String temp[] = new String[arr.length];
        capitalize(arr, 0, arr.length, temp);
    }
}
