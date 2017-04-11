package day17;

class Calculator {

	public int power(int n, int p) throws Exception {

		if (n < 0 || p < 0){
			throw new Exception("n and p should be non-negative");
		}

		if (p == 0) {
			return 1;
		}
		return n * power(n, p - 1);
	}

}
