// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void antidiagonals(int[][] array){
        int start;
        for (int iterator = 0 ;iterator < array.length; iterator++){
            int temp = iterator;
            start = 0 ;
            while (start >= 0 && temp >= 0){
                System.out.print(array[start][temp] + " ");
                start++;
                temp--;
            }
            System.out.println();
        }
        for (int iterator1 = 1 ; iterator1 < array.length ;iterator1++){
            int end = array.length - 1;
            int temporary = iterator1;
            while (temporary < array.length && end >= 1){
                System.out.print(array[temporary][end] + " ");
                temporary++;
                end--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        antidiagonals(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
    }
}
