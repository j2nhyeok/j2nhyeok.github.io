package Bookc;

import java.util.Arrays;
import java.util.Scanner;

public class BookManager {
    Scanner sc = new Scanner(System.in);
    Book[] books = new Book[100];
    String[] GenreSet = new String[100];

    int number = 0;
    int count = 1;
    int cnt = 1;
    
    public BookManager()
    {
        run();
    }

    public void run()
    {
        while(true)
        {
        	System.out.println("=====================���=========================");
    		System.out.println("| 1. ���ݼ����� å ���� (��������, �������� ���ð���)	|");
    		System.out.println("| 2. �ش� �帣����  ��� ����                  	|");
    		System.out.println("| 3. ��ϵ� ���� �󼼺���				|");
    		System.out.println("| 4. ���� ���� ����					|");
    		System.out.println("| 5. ���� ���� �߰�					|");
    		System.out.println("| 6. ����						|");
    		System.out.println("=================================================");
           
    		System.out.print(" ��� ��ȣ �Է� �ϼ��� : ");
    		number = sc.nextInt();
   	
    		
    		
    		System.out.println();
    		
    		if(number == 1) {
    			int choice = Integer.parseInt(getData("�������� : 1, �������� : 2"));
    			
    			if(choice == 1) {
    				RisingSort();
    			}else if (choice == 2) {
    				DescendingSort();
    			}
    			
    			
    		}
    		
    		else if(number == 2) {
    		    SelectGenre();
    			    		}
    		else if(number == 3) {
    			 selectBook();
    			
    		}
    		else if(number == 4) {
    			updateBook();
    		
    		}
    		else if(number == 5) {
    			registerBook();
    			
    		}
    		else if(number == 6) {
    			System.out.println("\n <���� ���� ���α׷��� �����մϴ�.>");
    			break;
    		}
    		else {
    			System.out.println("<������ ���� ��� ��ȣ�� �Է��ϼ̽��ϴ�.>");
    			System.out.println("<�ٽ� �Է����ּ���.>");
    			
    		
    		}
    		System.out.println("----------------------------------------------------------------------------���α׷�" + cnt +"�� ���� �Ϸ�");
    		System.out.println();
    		cnt++;
            
        }
    }
    
    public void SelectGenre() {
    	for(int i = 0; i < count - 1; i++) {
    		System.out.println("< " + GenreSet[i] + " >");
    		
    		for(int j = 0;  j< count - 1; j++) {
    			if(books[j] != null && books[j].getGenre().equals(GenreSet[i])){
    				System.out.print(books[j].getTitle() + "  ");
    				System.out.println();
    			}
    		}
    	}
    }
    public void DescendingSort() {
    	int prices[] = new int[count-1];
    	
    	for(int i = 0; i <count-1; i++) {
    		if(books[i] != null) {
    			prices[i] = books[i].getPrice();
    		}
    	}
    	
    	Arrays.sort(prices);
        System.out.println("����\t����\t���ǻ�\t�帣\t����");
        for(int i = count -2; 0 <= i ; i--) {
        	for(int j = count - 2; 0 <= j ; j--) {
        		if(books[j].getPrice() == prices[i]) {
        		System.out.println(books[j].PrintAll());
        		}
        	}
        }
    	
    }
    
    public void RisingSort() {
    	int prices[] = new int[count-1];
    	
    	for(int i = 0; i <count-1; i++) {
    		if(books[i] != null) {
    			prices[i] = books[i].getPrice(); //{5,34,2,1,8}
    		}
    	}
    	
    	Arrays.sort(prices); //{1,2,5,8,34}

    	System.out.println("����\t����\t���ǻ�\t�帣\t����");
       
    	for(int i = 0; i < count - 1 ; i++) {
        	for(int j  = 0; j< count - 1; j++) {
        		if(books[j].getPrice() == prices[i]) {
        			System.out.println(books[j].PrintAll());
        		}
        	}
      
         }
    }
    
    public void registerBook()
    {
        System.out.println("�� ���� å�� ����Ͻðڽ��ϱ�? ");
        int register_cnt = sc.nextInt();
      
        
        for(int j = 0; j < register_cnt; j++) {
        String Title = getData("����� ������ ������ �Է����ּ���  :");
        String Author = getData("����� ������ ���ڸ� �Է����ּ��� : ");
        String Publisher = getData("����� ������ ���ǻ縦 �Է����ּ��� : ");
        String Genre = getData("����� ������ �帣�� �Է����ּ��� : ");
        GenreSet[count-1] = Genre;
        int Price = Integer.parseInt(getData("����� ������ ���� �Է����ּ��� : "));

        for(int i = 0; i < books.length; i++)
        {
            if(books[i] == null)
            {
               
                books[i] = new Book(Title, Author, Publisher, Genre, Price);
                System.out.println("=================================================" + count + "�� ��ϿϷ�");
                System.out.println();
             count++;
                break;
            }
         
        }
      }
 
    }
    
    public void selectBook()
    {
        System.out.println("������� ��ϵ� �������");
        System.out.println("����\t����\t���ǻ�\t�帣\t����");
       
        for(int i = 0; i < books.length; i++) {
        	if(books[i] != null) {
        	System.out.println(books[i].PrintAll());
        	}
        }
    }
    
    public void updateBook()
    {
        System.out.print("������ ������ ������ �Է��ϼ���. : ");
        String bookTitle = sc.next(); 
        
        Book b = findBook(bookTitle);
        if(b == null)
        {
            System.out.println("�Է��Ͻ� å�� �������� �ʽ��ϴ�.");
            return;
        }
        
        int selectNum = 0;
        
        while(true) 
        {
            System.out.println("============================================================================");
            System.out.println("| 1. ���� ���� | 2. ���ڼ��� | 3. ���ǻ� ���� | 4. �帣 ���� | 5. ���� ���� | 6. ���� �Ϸ� |");
            System.out.println("============================================================================");
            System.out.println("��ȣ �Է� : ");
            selectNum = sc.nextInt();
            
           if(selectNum == 1){
        	   System.out.println("������ �������ּ��� : ");
        	   String Title = sc.next();       	
                b.setTitle(Title);
                System.out.println("���� ���� �Ϸ� ");
            }
           
           else if(selectNum == 2){
        	   System.out.println("���ڸ� �������ּ��� : ");
        	   String Author = sc.next();       	
               b.setAuthor(Author);
               System.out.println("���� ���� �Ϸ� ");
           } 
           
           else if(selectNum == 3){
        	   System.out.println("���ǻ縦 �������ּ��� : ");
        	   String Publisher = sc.next();       	
               b.setPublisher(Publisher);
               System.out.println("���ǻ� ���� �Ϸ� ");
           } 
           else if(selectNum == 4){
        	   System.out.println("�帣�� �������ּ��� : ");
        	   String Genre = sc.next();       	
               b.setGenre(Genre);
               System.out.println("�帣 ���� �Ϸ� ");
           } 
           
           else if(selectNum == 5){
        	   System.out.println("������ �������ּ��� : ");
        	   int Price = sc.nextInt();       	
               b.setPrice(Price);
               System.out.println("���� ���� �Ϸ� ");
           } 
           else if(selectNum == 6) {
        	   System.out.println("���� ����");
        	   break;
           }
            }
        }
    
    

    

    
    public Book findBook(String bookTitle)
    {
        for(int i = 0; i< books.length; i++)
        {
            if(books[i] != null && books[i].getTitle().equals(bookTitle))
            {
                return books[i];
            }
        }
        
        return null;
    }
    
    String getData(String message)
    {
        System.out.println(message);
        return sc.next();
    }
    

    
    public static void main(String[] args)
    {
        new BookManager();
    
    }
}