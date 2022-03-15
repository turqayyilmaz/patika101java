import java.util.Arrays;

public class DizideTekrarEdenCiftSayilar {

    static boolean isFind(int[] arr, int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val)
                return true;
        }

        return false;
    }

    public static void main(String[] args){
        int[] list = {3,4,3,6,4,7,8,6,5,7,4,8,20,30,34,20,40};
        int[] duplicateEven=new int[list.length];
        int duplicateIndex=0;
        for(int i = 0; i<list.length;i++){
            for(int j = 0; j<list.length;j++){
                {
                    if(i!=j && list[i]==list[j] && list[i]%2==0  )
                    {
                        if(!isFind(duplicateEven,list[i]))
                        {
                            duplicateEven[duplicateIndex++]=list[i];
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Tekrar eden çif sayılar:" + Arrays.toString(Arrays.copyOf(duplicateEven,duplicateIndex)));
    }
}
