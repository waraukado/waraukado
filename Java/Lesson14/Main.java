
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Account a = new Account();
		a.accountNumber = "123456";
		a.balance = 10000;
		System.out.println(a);

		Account b = new Account();
		b.accountNumber = " 123456";

		if(a.equals(b)) {
			System.out.println("同じ口座番号です");
		}
	}

}
