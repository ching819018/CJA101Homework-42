package HomeWork5;

public class HomeWork5_5 {
	public static void main(String[] arge) {
         
		HomeWork5_5 Authcode = new HomeWork5_5();
		System.out.println("產生的隨機亂數號碼是 : "+Authcode.genAuthcode());
		
	}
	public String genAuthcode() {
		
		String code = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				char random[] = new char[8];
				for(int i = 0 ; i< 8 ; i++) {
					random[i] = code.charAt((int)(Math.random()*62));
				}
				
				return new String(random);
}
}