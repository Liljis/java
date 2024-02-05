import java.util.*;
class prime{
	public static void main(String args[]){
		// Prime number check
		Scanner scn = new Scanner(System.in);
		int val = scn.nextInt();
		if( (val % 4 == 0) && (val % 100 == 0 || val % 400 != 0)){
			System.out.println("It's a prime number!");
		}else{
			System.out.println("not a prime number!");
		}
	}
}
