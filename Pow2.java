package challenge;

import java.math.BigInteger;

public class Pow2 {

public String powSolver(int base, int exp) {
	
	return BigInteger.valueOf(base).pow(exp).toString();
}


public int stringSum(String s) {
	int sum=0;
	for (int i=0; i<s.length(); i++) {
		sum+= Integer.valueOf(Character.getNumericValue(s.charAt(i)));
	}
	System.out.println(sum);
	
	return sum;
}

public int sumDigits(int value) {
	int sum=0;
	
	while(value>0) {
		sum+=value%10;
		value=value/10;
	}
	
	
	return sum;
}

}
