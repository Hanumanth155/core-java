class KeyBoardExecutor{
	
	public static void main(String[] args){
		
		double price = KeyBoard.getPrice();
		System.out.println("The price of KeyBoard is : " + price);
		
		String brand = KeyBoard.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = KeyBoard.getModelNumber();
		System.out.println("Model number : " + number);
		
		String type = KeyBoard.getType();
		System.out.println("Type : " + type);
		
		boolean backlight = KeyBoard.getBacklightSupport();
		System.out.println("Backlight support : " + backlight);
		
		String color = KeyBoard.getColor();
		System.out.println("Color : " + color);
		
	}
}
