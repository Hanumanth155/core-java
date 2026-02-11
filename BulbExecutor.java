class BulbExecutor{
	
	public static void main (String[] bulbstatus){
		
		boolean bulb = Bulb.onOrOff();
		
		System.out.println("The bulb is currently turned On : "+bulb);
	}
}