class BackpackExecutor{
	
	public static void main(String[] args){
		
		double price = Backpack.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = Backpack.getBrand();
		System.out.println("Brand : " + brand);
		
		String capacity = Backpack.getCapacity();
		System.out.println("Capacity : " + capacity);
		
		int compartments = Backpack.getNoOfCompartments();
		System.out.println("Compartments : " + compartments);
		
		boolean resistant = Backpack.getWaterResistant();
		System.out.println("Water resistant : " + resistant);
		
		String color = Backpack.getColor();
		System.out.println("Color : " + color);
		
	}
}
