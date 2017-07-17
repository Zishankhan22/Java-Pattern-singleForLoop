import java.util.Scanner;


public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String finalString="";
		int num = sc.nextInt(); 
		int j = num;
		for(int i = 0; i < num; j--, i++) {

			finalString = finalString + String.format("%" + j + "s", " ")+String.format("%0" + (i+1) + "d", 0).replace("0", "*")+"\n";

			//System.out.print(String.format("%" + j + "s", " "));
			//System.out.println(String.format("%0" + (i+1) + "d", 0).replace("0", "*"));
		}
		System.out.println(finalString);
	}
}
