package sort;

public class Sorting {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            printArray(a);
            if (isSorted) {
                break;
            }
        }
    }

    public static void insertSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            printArray(a);
        }
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
            printArray(a);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 7, 8, 1, 2};
        int[] b = {1, 2, 3, 4, 5, 7, 6};
//        bubbleSort(b);
//        insertSort(arr);
        selectionSort(arr);
    }
}
