class GraphicsCardExecutor{
	
	public static void main(String[] args){
		
		double price = GraphicsCard.getPrice();
		System.out.println("The price of Graphics Card is : " + price);
		
		String brand = GraphicsCard.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = GraphicsCard.getModelNumber();
		System.out.println("Model : " + number);
		
		String memory = GraphicsCard.getMemory();
		System.out.println("Memory : " + memory);
		
		String inter = GraphicsCard.getInterface();
		System.out.println("Interface : " + inter);
		
		boolean ray = GraphicsCard.getRayTracingSupport();
		System.out.println("Ray Tracing support : " + ray);
		
		String color = GraphicsCard.getColor();
		System.out.println("Color : " + color);
		
	}
}
