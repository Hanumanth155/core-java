class RouterExecutor{
	
	public static void main(String[] args){
		
		double price = Router.getPrice();
		System.out.println("The price of Router is : " + price);
		
		String brand = Router.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = Router.getModelNumber();
		System.out.println("Model number : " + number);
		
		String speed = Router.getSpeed();
		System.out.println("Speed : " + speed);
		
		int antennas = Router.getNoOfAntennas();
		System.out.println("Number of antennas : " + antennas);
		
		boolean dual = Router.getDualBandSupport();
		System.out.println("Dual band support : " + dual);
		
		String color = Router.getColor();
		System.out.println("Color : " + color);
		
	}
}
