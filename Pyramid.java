import java.util.Scanner;
class Pyramid {
     public static void main(String[] args) {
    	 Scanner get=new Scanner(System.in);
    	 System.out.println("Enter the number of rows");
    	 int rows=get.nextInt();
    	 
    	 for(int i=1; i<=rows; i++)
    	 {
    		 for(int j=i; j<=rows; j++)
    		 {
    			 System.out.print(" ");
    		 }
    		 for(int j=1; j<=i; j++)
    		 {
    			 System.out.print("* ");
    		 }
    		 System.out.println();
    	 }
    	
     }
}
