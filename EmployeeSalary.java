public class EmployeeSalary {
    static void newSalary(int arr[], int i, int n, int temp[]){
        if(i==n){
            printArray(temp);
            return;
        }
        temp[i] = (int)(arr[i] + 0.1*arr[i]);
        newSalary(arr, i+1, n, temp);
    }

    static void printArray(int temp[]){
        System.out.println("\nNew array: ");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10000, 20000, 30000, 25000};
        int temp[] = new int[arr.length];
        newSalary(arr, 0, arr.length, temp);
    }
}
