class TelevisionExecutor{
	
	public static void main(String[] args){
		
		double price = Television.getPrice();
		System.out.println("The price of Television is : " + price);
		
		String brand = Television.getBrand();
		System.out.println("The brand is : " + brand);
		
		String number = Television.getModelNumber();
		System.out.println("The model number is : " + number);
		
		String size = Television.getScreenSize();
		System.out.println("Screen size : " + size);
		
		String resolution = Television.getResolution();
		System.out.println("Resolution : " + resolution);
		
		boolean smart = Television.getSmartTVSupport();
		System.out.println("Smart TV support : " + smart);
		
		String type = Television.getDisplayType();
		System.out.println("Display type : " + type);
		
		String color = Television.getColor();
		System.out.println("Color : " + color);
		
	}
}
