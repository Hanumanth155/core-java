class ChaatShop{
	
public static void main(String[] args){


   String availableChaat[] = {"Fruit Chaat","Matar Chaat","Bread Pakoda","Onion Pakoda","Mirchi Bajji","Banana Bajji","Ragda Patties","Cheese Balls","Vegetable Cutlet","Veg Momos","Masala Puri","Kaladdi chaat","Palak patta chaat","Aloo Tikki","Pav bhaji","vada pav","Pani puri","Sev puri","Bhel puri","Gobi","Chinese noodles","Dhai puri","Samosa","Kachuri","Chole chaat","Dabeli"};
   
  
   
   String fruitChaat = availableChaat[0];
   String matarChaat = availableChaat[1];
   String breadPakoda = availableChaat[2];
   String onionPakoda = availableChaat[3];
   String mirchiBajji = availableChaat[4];
   String vegMomos = availableChaat[5];
   String masalaPuri = availableChaat[6];
    for(String names : availableChaat){
	   System.out.println(names);
   }
   System.out.println(fruitChaat + " "+ matarChaat+" "+breadPakoda+" "+onionPakoda+" "+mirchiBajji+" "+vegMomos+ " "+masalaPuri);
   
}

}