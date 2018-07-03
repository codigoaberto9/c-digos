package challenge;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Pow p = new Pow();
		// System.out.println(p.sumIntDigits(p.stringSum(new String(p.powSolver(3,
		// 1000)))));

		Pow2 p2 = new Pow2();
		System.out.println(p2.sumDigits(p2.stringSum(p2.powSolver(3, 1000))));

		Matrix m = new Matrix();
		// System.out.println(Arrays.deepToString(m.populateMatrixEven(10)).replace("[[", " [").replace("],", "]\n").replace("]]", "]"));

		//System.out.println("\n\n"+Arrays.deepToString(m.populateMatrixOdd(10)).replace("[[", " [").replace("],", "]\n").replace("]]", "]"));
		

	}
    

}
