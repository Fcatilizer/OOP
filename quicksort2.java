class A {
    void quickSort(int a[], int first, int last) {
        if (first < last) {
            int pivot = first;
            int i = first;
            int j = last;

            while (i < j) {
                while (a[i] <= a[pivot] && i < last)
                    i++;
                while (a[j] > a[pivot])
                    j--;

                if (i < j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            int temp = a[pivot];
            a[pivot] = a[j];
            a[j] = temp;
            
            quickSort(a, first, j - 1);
            quickSort(a, j + 1, last);
        }
    }

    public static void main(String[] args) {
        int n, i;
        System.out.println("Enter the number of elements: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        A obj = new A();
        obj.quickSort(a, 0, n - 1);

        System.out.println("Sorted array: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
