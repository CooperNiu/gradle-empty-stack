
public class Android extends Mobile{

		public Android(String name, String color, String brand) {
			super(name, color, brand);
			// TODO Auto-generated constructor stub
			this.brand = "Android";
		}
		
		@Override
		public void printMobile() {
			System.out.println("name: "+ name);
			System.out.println("color: "+ color);
			System.out.println("brand:"+ brand);
			System.out.println();
		}
}
