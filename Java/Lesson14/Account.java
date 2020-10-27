
public class Account {
	String accountNumber;
	int balance;
	//①toStringのオーバーライド
	public String toString() {
		return
		"\\" + this.balance + "(口座番号：" +
				this.accountNumber + ")";
	}
	//②equalsのオーバーライド
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Account) {
			Account a = (Account)o;
			String ano1 = this.accountNumber.trim();
			String ano2 = a.accountNumber.trim();
			if(ano1.equals(ano2)) {
				return true;
			}
		}
		return false;
	}
}
