
public class Main {
	public static void main(String[] args) {
		Mobile mobile = new Mobile("mobile phone", "red", "mobile");
		mobile.printMobile();
		
		iPhone iph = new iPhone("Apple phone", "blue", "Apple");
		iph.printMobile();
		
		Android android = new Android("Android", "green", "Huawei");
		android.printMobile();
	}
}
