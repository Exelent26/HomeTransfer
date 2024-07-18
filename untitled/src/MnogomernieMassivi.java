public class MnogomernieMassivi {
    public static void main(String[] args) {
        int[] number = {1,2,3};


        int[][] matrice = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        for(int i = 0;i<matrice.length; i++){
            for(int j = 0; j< matrice[i].length;j++){
                System.out.print(matrice[i][j] + " "); // FIXME: System.our.print - выводит на одной строке, не перенося на новую строку как println
            }
            System.out.println();

        }





// TODO: вывод двумерного массива с обозначение позиции

//        System.out.println(matrice[2][4]);
//        System.out.println(matrice[0][2]);
//
//        String[][] x = new String[2][4];
//        x[1][3] = "privet";
//        System.out.println(x[1][3]);
    }

}
