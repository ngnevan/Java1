public class Java1_HomeWork2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else if (arr1[i] == 1) {
                arr1[i] = 0;
            }
        }

        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }

        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
        }

        int[] arr5 = {1, 4, 5, 3, 1, 8, 6, 5, 3, 1};
        int max = arr5[0];
        int max_index = 0;
        int min = arr5[0];
        int min_index = 0;
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
                max_index = i;
            }
            if (arr5[i] < min) {
                min = arr5[i];
                min_index = i;
            }
        }
        System.out.println(max + " " + max_index);
        System.out.println(min + " " + min_index);

        int[] arr6 = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(arr6));

        int[] arr7 = {1, 2, 3, 4, 5};
        moveElements(arr7, 2);
    }

    static boolean checkBalance(int[] arr6) {
        int sumL, sumR;
        for (int i = 1; i < arr6.length; i++) {
            sumL =  0;
            for (int j = 0; j < i; j++) {
                sumL = sumL + arr6[j];
            }
            sumR = 0;
            for (int n = i; n < arr6.length; n++) {
                sumR = sumR + arr6[n];
            }
            if (sumL == sumR) {
                return true;
            }
        }
        return false;
    }

    static void moveElements(int[] arr7, int n) {
        int k;
        if (n > 0) {
            for (int j = 1; j <= n; j++) {
                k = arr7[arr7.length - 1];
                for (int i = arr7.length - 1; i > 0; i--) {
                    arr7[i] = arr7[i-1];
                }
                arr7[0] = k;
            }
        } else if (n < 0) {
            for (int j = -1; j >= n; j--) {
                k = arr7[0];
                for (int i = 0; i < arr7.length-1; i++) {
                    arr7[i] = arr7[i+1];
                }
                arr7[arr7.length - 1] = k;
            }
        }
        for (int i = 0; i < arr7.length; i++) {
            System.out.print(arr7[i] + " ");
        }
    }
}