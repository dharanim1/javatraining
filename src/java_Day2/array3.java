package java_Day2;

public class array3 {

	public static void main(String[] args) {
		//int [][][] arr3d = new int[2][3][4];
		int [][][] arr3d = {
	             {
	              {1,2,3,4},
                 {5,6,7,8},
                 {1,3,5,7} 			                  
	             } ,
	             {
	               {1,2,3,4},
	               {5,6,7,8},
	               {1,3,5,7}
	             }
	             
              };
for (int[][] twoDarr : arr3d) {
	for(int[] oneDarr : twoDarr ) {
		for (int num : oneDarr) {
		System.out.print(num+"");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
