import java.util.Scanner;
public class day1 {
    static void printArray(int[][] arr ){
        for (int i=0; i< arr.length;i++){

        for(int j=0; j<arr[i].length;j++){
            System.out.println(arr[i][j]); 
        }
        System.out.println();
        }

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of rowa");
    int r = sc.nextInt();
    System.out.println("Enter the no. of colums");
    int c = sc.nextInt();

    int[][] arr= new int[r][c];
    System.out.println("Enter"+r*c+"elements");

    for(int i=0;i<=r;i++){
        for(int j=0;j<=c;j++){
            arr[i][j]=sc.nextInt();


        }
    }
/*   int[][] arr = new int[2][3]// assigned value is 6 
  int[][] arr2 = {{1,5,6},
                   {7,9,11},
                   {4,8,7}};

*/
 printArray(arr);
}    
} 