import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("enter size of the row:");
        int row = obj.nextInt();
        System.out.println("enter size of the column:");
        int col = obj.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter array numbers:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = obj.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            int sum = 0;
            int product = 1;
            for(int j=0;j<col;j++){
                sum = sum +arr[i][j];
                product = product*arr[i][j];
            }
            System.out.println("Sum and product of row "+ i +" are: "+sum+" "+product);
        }

        for (int j = 0; j < col; j++) {
            int sum = 0;
            int product = 1;
            for (int i = 0; i < row; i++) {
                sum += arr[i][j];
                product *= arr[i][j];
            }
            System.out.println("Sum and product of column " + j + " are: " + sum + " " + product);
        }
        obj.close();
    } 
}
