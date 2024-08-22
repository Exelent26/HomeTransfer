package lvl11.objects;

import java.util.Arrays;

public class razvorot {
    public static void main(String[] args) {
        int [] x = {5,4,3,2,1};
        System.out.println(Arrays.toString(x));

        for(int i = 0,j = x.length-1;i<=x.length/2&&j>=x.length/2; i++, j--){
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;

        }
        System.out.println(Arrays.toString(x));


    }

}

