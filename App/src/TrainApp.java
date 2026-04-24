public class TrainApp {

    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        bubbleSort(capacities);

        System.out.println("Sorted Passenger Bogie Capacities:");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}
