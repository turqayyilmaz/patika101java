
public class asalsayilar {
    public static void main(String[] args){
        int i;
        for(i = 2 ; i <= 100 ; i++ ) {
            boolean asal= false;
            for (int j = 2; j < i; j++)
                if (i % j == 0  ) {
                       asal=true;
                       break;

                }

            if(!asal)System.out.print(i + " ");
        }
    }
}
