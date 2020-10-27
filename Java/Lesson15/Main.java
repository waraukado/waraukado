//第15章練習１
public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < 100;i++) {
			sb.append(i+1).append(",");
		}
		String s = sb.toString();
		String[] sh = s.split(",");
		//カンマ区切りで連結したものを表示
		System.out.println(s);
		//配列に格納したものを表示
		for(String suji:sh) {
			System.out.print(suji);
		}
	}

}
