import java.util.Scanner;
class MultiplicationTable {
  public static void main(String[] args) {
	  Scanner g = new Scanner(System.in);
	      System.out.println("Enter the Integer Number");
		  int numb=g.nextInt();
		  int sum=0;
		  System.out.println("The multiplication of "+ numb);
		  for(int i=1; i<=10; i++)
		  {
			  sum=numb*i;
			  System.out.println(numb + "*" + i + "=" + sum);
		  }
  }
}