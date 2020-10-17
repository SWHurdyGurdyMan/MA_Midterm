
public class SimpleJavaExpressions{
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 13;
		System.out.println("The 1st number is: " + Mystery(num1, 6));//1st number is 78
		System.out.println("The 2nd number is: " + Mystery(num2 % 5, 1 + num1 * 2));//2nd number is 73
		System.out.println(5.0 / 4 - 4 / 5);//1.25
		System.out.println(7 < 9 - 5 && 3 % 0 == 3);//false
		System.out.println("B" + 8 + 4);//B12
		}
		static private int Mystery(int num1, int num2) {
		num1 = Unknown(num1, num2);
		num2 = Unknown(num2, num1);
		return(num2);
		}
		static private int Unknown(int num1, int num2) {
		int num3 = num1 + num2;
		num2 += num3 * 2;
		return(num2);
		}
}