import java.util.Scanner;

public class day11 {

	public static void main(String[] args) {
        int sum = 0;
        int maxSum = -63;

        Scanner scan = new Scanner(System.in);
        int array[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                array[i][j] = scan.nextInt();
            }
        }
        for(int i=1;i < 5;i++){
            for(int j=1;j<5; j++){
                sum = array[i-1][j-1] + array[i-1][j] + array[i-1][j+1]+
                                    array[i][j]
                    + array[i+1][j-1] + array[i+1][j] + array[i+1][j+1];
                    if (sum>maxSum){
                        maxSum = sum;
                    }
            }
        }
        System.out.println(maxSum);
    }
	
}
