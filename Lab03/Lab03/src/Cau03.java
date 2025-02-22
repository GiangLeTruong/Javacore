import java.util.Scanner;

public class Cau03 {

    static int[] createArray(int n) {
        System.out.println("Please element of array: ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("- Element [%d]: ",i);
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] ArraySort(int[] currentArr){
        int[] tempArr = currentArr;
        for(int i = 0; i < tempArr.length-1; i++)
        {
         for(int j=i+1;j<tempArr.length;j++)
         {
            if(tempArr[i]>tempArr[j])
            {
                int temp = tempArr[i];
                tempArr[i] = tempArr[j];
                tempArr[j] = temp;
            }
         }
        }
        return tempArr;
    }
    public static void main(String[] args) {
        System.out.println("Please input a number for size of array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = createArray(num);

        System.out.println("Array is: ");
        printArray(arr);

        arr=ArraySort(arr);
        System.out.println("Array after sort is: ");
        printArray(arr);

        System.out.printf("Min element is: %d \n",arr[0]);
        System.out.printf("Max element is: %d",arr[arr.length-1]);
    }
}