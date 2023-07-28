package arrays;

public class AssignValue {
    public static void main(String[] args) {
        /*
            int[] arr = new int[]{45,65,76};
            int[] arr = {45,65,76};

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        */

        //int[][] arr = {{45,76,78},{89,90,12},{34,70,46}};
        int[][] arr = {
                new int[]{45,76,78},
                new int[]{89,90,12},
                new int[]{45,78,23},
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
