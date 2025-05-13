import java.util.Scanner;
class Main{
	public static void main(String[] args){
		double num,num2;
		double[][] arr = {{0.03,0.04,0.05},
				{3.0,4.0,5.0},
				{0.3,0.4,0.5},
				{2,3,4},
				{5,12,13},
				{0.5,1.2,1.3},
				{19.0,19.0,19.0},
				{0.9,4.0,4.1},
				{1.9,1.9,1.9},
				{2.5,6.0,6.5},
				{4,6,8}};
  
 		for(int i = 0; i < 11; i++){
			num = (arr[i][0] * arr[i][0]) + (arr[i][1] * arr[i][1]);
			num2 = arr[i][2] * arr[i][2];
			double eps = 10e-10;
      			for(int j = 0; j < 3; j++){
        			System.out.print(arr[i][j] + " ");
      			}
      			System.out.print("   ");
			
      			if(num > num2 || num == num2){
				if(num - num2 >= eps)
         				System.out.println("acute-angled"); //鋭角
				else
          				System.out.println("right-angled"); //直角
			}else if(num < num2 || num == num2){
				if(num2 - num >= eps)
          				System.out.println("obtuse"); //鈍角
				else
          				System.out.println("right-angled"); //直角
			}
      		}
    	}
}
