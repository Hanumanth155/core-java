class GasStoveExecutor{
	
	public static void main(String[] args){
		
		double price = GasStove.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = GasStove.getBrand();
		System.out.println("Brand : " + brand);
		
		int burners = GasStove.getNoOfBurners();
		System.out.println("Number of burners : " + burners);
		
		String material = GasStove.getMaterial();
		System.out.println("Material : " + material);
		
		boolean ignition = GasStove.getAutoIgnition();
		System.out.println("Auto ignition : " + ignition);
		
		String color = GasStove.getColor();
		System.out.println("Color : " + color);
		
	}
}
