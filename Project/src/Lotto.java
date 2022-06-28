import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
	public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	public static LottoNumber[ ]  numbers = new LottoNumber[10];
	public static int selectNumber = 0;
	public static int buyCnt = 0; // 구매할 줄 갯수
	
	public Lotto() throws NumberFormatException, IOException {
		run();
	}
	
	public void run() throws NumberFormatException, IOException {
		
    	
       
	    buyCnt = Integer.parseInt(getData("로또 몇 줄을 사시겠습니까? ")); 
		
	    
	    System.out.println("                                                  ");
		System.out.println("=====================목록=========================");
		System.out.println("1. 자동");
		System.out.println("2. 반자동");
		System.out.println("3. 수동");
		System.out.println("4. 현재까지 발권된 로또 번호 보기.");
		System.out.println("=================================================");
		System.out.println("                                                  ");

		 selectNumber = Integer.parseInt(getData("번호를 입력하세요."));
		 System.out.println();
		
		 	if (selectNumber == 1) {
				autoNum();
			} else if (selectNumber == 2) {
				semiAuto();
			} else if (selectNumber == 3) {
				manual();
			} else if (selectNumber == 4) {
				showNumber();
			}
		
       
	}


	private void showNumber() {
		for(int i = 0 ; i < 10; i++) {
			if(numbers[i] != null) {
				System.out.println(numbers[i].getNumbers());
			}
		}
		
	}

	private void manual() {
		// TODO Auto-generated method stub
		
	}

	public static void semiAuto() {
		
		
	}

	public static void autoNum() {
		while(buyCnt-- >0) {
			for(int i = 0; i < 10 ; i++) {
				if(numbers[i] == null) {
					numbers[i] = new LottoNumber("자동" ,lottoNumbers());
					break;
				}
			}
		}
	
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
    	
       new Lotto();
		
    }
	
    public static List<Integer> lottoNumbers() {
        Set<Integer>set = new HashSet<Integer>();
		
        while(set.size() != 6){
            set.add((int)(Math.random() * 45 + 1));
        }
		
        List<Integer> list = new ArrayList<Integer>(set);
      
        Collections.sort(list);
         
       return list;
    }
	
    private String getData(String message) throws IOException {
		System.out.println(message);
		return bf.readLine();
	}
}
