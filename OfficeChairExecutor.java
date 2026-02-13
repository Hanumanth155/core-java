class OfficeChairExecutor{
	
	public static void main(String[] args){
		
		double price = OfficeChair.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = OfficeChair.getBrand();
		System.out.println("Brand : " + brand);
		
		String material = OfficeChair.getMaterial();
		System.out.println("Material : " + material);
		
		boolean adjustable = OfficeChair.getAdjustableHeight();
		System.out.println("Adjustable height : " + adjustable);
		
		boolean wheels = OfficeChair.getWheelSupport();
		System.out.println("Wheel support : " + wheels);
		
		String color = OfficeChair.getColor();
		System.out.println("Color : " + color);
		
	}
}
