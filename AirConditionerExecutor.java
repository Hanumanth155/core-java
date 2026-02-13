class AirConditionerExecutor{

	public static void main(String[] args){

		double price = AirConditioner.getPrice();
		System.out.println("Price : " + price);

		String brand = AirConditioner.getBrand();
		System.out.println("Brand : " + brand);

		String model = AirConditioner.getModelNumber();
		System.out.println("Model Number : " + model);

		String capacity = AirConditioner.getCapacity();
		System.out.println("Capacity : " + capacity);

		int rating = AirConditioner.getStarRating();
		System.out.println("Star Rating : " + rating);

		String type = AirConditioner.getType();
		System.out.println("Type : " + type);

		boolean inverter = AirConditioner.getInverterTechnology();
		System.out.println("Inverter : " + inverter);

		String color = AirConditioner.getColor();
		System.out.println("Color : " + color);
	}
}
