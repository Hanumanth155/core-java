class HardDiskExecutor{
	
	public static void main(String[] args){
		
		double price = HardDisk.getPrice();
		System.out.println("The price of HardDisk is : " + price);
		
		String brand = HardDisk.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = HardDisk.getModelNumber();
		System.out.println("Model number : " + number);
		
		String capacity = HardDisk.getStorageCapacity();
		System.out.println("Storage capacity : " + capacity);
		
		String type = HardDisk.getType();
		System.out.println("Type : " + type);
		
		String connect = HardDisk.getConnectivity();
		System.out.println("Connectivity : " + connect);
		
		String color = HardDisk.getColor();
		System.out.println("Color : " + color);
		
	}
}
