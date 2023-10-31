public class num2 {
    public static void main(String[] args) {
        int [][] mass1 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 6, 5, 1, 10 },
                { 2, 1, 5, 8 }
        };
        int [][] mass2 = {
                { 5, 9, 8, 10, 28 },
                { 6, 1, 0, 15, 16 },
                { 9, 5, 4, 8, 7 },
                { 8, 28, 24, 25, 80 }
        };
        System.out.println("Номера столбцов из первого массива: ");
        for (int i = 0; i < mass1.length;i++){
            for (int j = 0; j < mass1.length;j++){
                if (mass1[i][j] % 5 == 0 || mass1[i][j] % 7 == 0){
                    System.out.println(mass1[i][j] + "\n Ряд: " + i + "\n Столбец: " + j);
                }
            }
            System.out.println(" ");
        }
        System.out.println("Номера столбцов из второго массива: ");
        for (int i = 0; i < mass2.length;i++){
            for (int j = 0; j < mass2.length;j++){
                if (mass2[i][j] % 5 == 0 || mass2[i][j] % 7 == 0){
                    System.out.println(mass2[i][j] + "\n Ряд: " + i + "\n Столбец: " + j);
                }
            }
            System.out.println(" ");
        }
    }
}