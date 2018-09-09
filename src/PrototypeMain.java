import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PrototypeMain {


    public static void main(String[] args) {

        new PrototypeMain().test();

        /*
        ArrayList<int[]> rowArr = new ArrayList<>();

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("How many rows?");
            int rows = scan.nextInt();

            int primaryAmount = 5;
            int secondaryAmount = 2;

            for (int i = 0; i < rows; i++) {

                int[] primaryNumbers = new int[primaryAmount];
                int[] secondaryNumbers = new int[secondaryAmount];

                for (int j = 0; j < primaryAmount; j++) {
                    primaryNumbers[j] = new Random().nextInt(50) + 1;
                }

                for (int j = 0; j < secondaryAmount; j++) {
                    secondaryNumbers[j] = new Random().nextInt(10) + 1;
                }

                rowArr.add(primaryNumbers);
                rowArr.add(secondaryNumbers);
            }



            for (int[] j: rowArr) {
                for (int g: j) {
                    System.out.print(g + " ");
                }
                System.out.println();
            }
        }
        */
    }

    public ArrayList createRows(int numberOfRows, int primaryAmount, int primaryMax, int secondaryAmount, int secondaryMax){
     ArrayList<int[]> rowList = new ArrayList<>();

        for (int i = 0; i < numberOfRows; i++) {
            int[] primaryArr = new int[primaryAmount];

            for (int j = 0; j < primaryAmount; j++) {
                boolean arrayNotUnique = false;
                do {
                    primaryArr[j] = new Random().nextInt(primaryMax) + 1;
                    for (int k = 0; k < j-1; k++) {
                        if(primaryArr[k] == primaryArr[j]){
                            arrayNotUnique = true;
                        }
                    }
                }while(arrayNotUnique);

            }
        }


     return rowList;
    }

    public int[] sortRow(int[] intArr){


        return null;
    }

    public int[][] combineToRow(int[] primaries, int[] secondaries){
        int[][] row = new int[2][];

        row[0] = primaries;
        row[1] = secondaries;

        return row;
    }

    public void test(){
        ArrayList<int[]> numbers = createRows(2,5,50,2,10);

        int[][] row = combineToRow(numbers.get(0), null);

        System.out.println(row);
    }
}

