import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    /*
    Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99
     */

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Dizinin Boyutu: ");
        int n = scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Dizinin elemanlarını giriniz:");


        for(int i =1; i<=n;i++)
        {
            System.out.print(i + ". Elemanı: ");
            arr[i-1]=scan.nextInt();
        }


        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    int temp= min;
                    arr[i]=arr[j];
                    arr[j]=min;
                    min=arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
