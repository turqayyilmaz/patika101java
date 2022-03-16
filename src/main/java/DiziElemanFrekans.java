public class DiziElemanFrekans {

    static int isFind(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int[] tempArr = new int[arr.length];
        int tempIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int index = isFind(tempArr, arr[i]);
            if (index >= 0) {
                continue;
            }
            tempArr[++tempIndex] = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}
