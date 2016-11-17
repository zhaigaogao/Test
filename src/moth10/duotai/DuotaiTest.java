package moth10.duotai;

public class DuotaiTest {

	public static void  buyBook(Book book){
		System.out.println("---------我开始买书了-----------");
		book.read();
		System.out.println("---------我开始买书了-----------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnglishBook englishBook=new EnglishBook();
		englishBook.learn();
		buyBook(englishBook);
	}

}
