# Default constructor

if you don't write a constructor,
system generate a constructor without parameter for you.

	public class Apple {
		private String type;
		private double price;
		
		
		
	//	public Apple() {
	//			this("",0.0);
	//	}
	//	
	//	public Apple(String type, double price) {
	//		super();
	//		this.type = type;
	//		this.price = price;
	//	}
	
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Apple [type=" + type + ", price=" + price + "]";
		}
		
		
	}





