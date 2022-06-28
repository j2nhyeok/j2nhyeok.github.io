import java.util.List;

public class LottoNumber {

	public int numbers[] = new int[6];
	private String category;
	

	
	
	public String getNumbers() {
		StringBuilder sb = new StringBuilder();
		for(int a : numbers) {
			sb.append(a).append(" ");
		}
		return sb.toString();
	}





	public String getCategory() {
		return category;
	}





	public void setCategory(String category) {
		this.category = category;
	}





	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}





	public LottoNumber(String category, List<Integer> numbers) {
		this.category = category;
		for(int i = 0; i <=5 ; i++) {
			this.numbers[i] = numbers.get(i);
		}
	}
	
	
}