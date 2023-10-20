public class Main {
    public static void main(String[] args) {
        int[] arr = {7,4,17,1,8,16};

        //bubbleSort(arr);

        //Test.bubbleSort(arr);

        //TestTwo.bubbleSort(arr);

        TestThree.bubbleSort(arr);

        print(arr);
    }

    static void bubbleSort(int[] arr) {
        int arrLength = arr.length;

        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            }

            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }
}
