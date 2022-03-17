import java.util.Arrays;

public class MatrisTranspozu {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};

        System.out.println("Matris : ");
        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
        int[][] transpoze = transpoze(arr);
        System.out.println("Transpoze : ");
        for (int i = 0; i < transpoze.length; i++)
            System.out.println(Arrays.toString(transpoze[i]));
    }

    public static int[][] transpoze(int[][] arr) {
        int[][] transpozeArr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpozeArr[j][i] = arr[i][j];
            }
        }
        return transpozeArr;
    }
}
