package challenge;

import java.math.BigInteger;

public class Pow {

	public String powSolver(int base, int exp) {

		return (BigInteger.valueOf(base).pow(exp).toString());

	}

	public int stringSum(String s) {

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			sum += Character.getNumericValue(s.charAt(i));
		}

		return sum;
	}

	public int sumIntDigits(int value) {
		int sum = 0;

		while (value > 0) {
			sum += value % 10;
			value = value / 10;
		}

		return sum;
	}

}
