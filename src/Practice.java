
public class Practice {

	public boolean isPrime (int num) {
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int sumDigits(int num) {
		int total = 0;
		int rem = 0;
		for(int i = 0; i < num; i++) {
			total = 0;
			rem = 0;
			rem = num % 10;
			total += rem;
			num /= 10;
		}
		return total;
	}
}
