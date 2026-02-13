class NotebookExecutor{
	
	public static void main(String[] args){
		
		double price = Notebook.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = Notebook.getBrand();
		System.out.println("Brand : " + brand);
		
		int pages = Notebook.getNoOfPages();
		System.out.println("Number of pages : " + pages);
		
		String size = Notebook.getSize();
		System.out.println("Size : " + size);
		
		String type = Notebook.getType();
		System.out.println("Type : " + type);
		
	}
}
