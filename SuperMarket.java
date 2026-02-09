class SuperMarket{
	
public static void main(String [] market){

String healthProducts[] = {"Protein Powder","Whey Protein","Mass Gainer","Multivitamins","Calcium Tablets","Iron Supplements","Vitamin C Tablets","Fish Oil Capsules","Omega 3 Capsules","Glucose Powder","ORS Powder","Electrolyte Drink","Fiber Supplement","Digestive Tablets","Herbal Capsules","Ashwagandha Powder","Chyawanprash","Honey","Organic Jaggery","Brown Sugar","Stevia","Sugar Free Tablets","Health Bars","Energy Bars","Dry Fruits Mix"};

String travelAccessories[] = {"Travel Bag","Trolley Bag","Backpack","Neck Pillow","Eye Mask","Travel Blanket","Shoe Pouch","Laundry Bag","Passport Holder","Travel Wallet","Luggage Lock","Luggage Tag","Travel Adapter","Power Converter","Travel Toiletry Kit","Mini Bottles","Travel Towel","Rain Cover","Sleeping Mask","Ear Plugs","Inflatable Pillow","Travel Organizer","Packing Cubes","Waist Pouch","Duffel Bag"};

String partySupplies[] = {"Balloons","Paper Cups","Paper Plates","Plastic Cups","Plastic Plates","Party Hats","Party Masks","Streamers","Confetti","Birthday Candles","Cake Topper","Gift Wrap","Gift Bags","Ribbon","Bows","Foil Balloons","Party Poppers","Disposable Spoons","Disposable Forks","Disposable Knives","Table Cover","Cupcake Liners","Invitation Cards","Return Gift Boxes","Party Lights"};

String hardwareItems[] = {"Hammer","Screwdriver","Spanner","Wrench","Pliers","Measuring Tape","Allen Key","Nails","Screws","Bolts","Nuts","Wall Hooks","Adhesive Hooks","Drill Bits","Hand Drill","Glue Gun","Glue Sticks","Cable Ties","Insulation Tape","Masking Tape","Double Sided Tape","Rope","Chain","Padlock","Door Stopper"};

String lightingAndElectricalAcessories[] = {"LED Bulb","CFL Bulb","Tube Light","Night Lamp","Table Lamp","Emergency Light","Torch","Flashlight","Extension Board","Plug Top","Switch","Socket","Fuse","MCB","Electric Wire","Cable Reel","Bulb Holder","Pendant Light","Wall Light","Garden Light","Solar Light","Inverter Bulb","Power Indicator","Dimmer Switch","Motion Sensor Light"};

String pujaItems[] = {"Agarbatti","Dhoop","Camphor","Sambrani","Puja Oil","Cotton Wicks","Kumkum","Vibhuti","Chandan Powder","Puja Flowers","Puja Plate","Bell","Incense Sticks","Havan Samagri","Ghee Lamp","Brass Lamp","Coconut","Betel Leaves","Betel Nuts","Puja Thread","Kalash","Idols","Photo Frames","Panchamrit","Holy Water"};

String snacksAndNamkeen[] = {"Chips","KurKure","Lays","Bhujia","Mixture","Aloo Sev","Peanuts","Roasted Chana","Popcorn","Murukku","Chakli","Banana Chips","Corn Chips","Tortilla Chips","Nachos","Fryums","Masala Peanuts","Cheese Balls","Snack Sticks","Spicy Rings","Salted Cashews","Salted Almonds","Salted Pistachios","Dry Fruits Mix","Roasted Makhana"};

String sweets[] = {"Ladoo","Jalebi","Gulab Jamun","Rasgulla","Mysore Pak","Kaju Katli","Halwa","Barfi","Peda","Kalakand","Soan Papdi","Modak","Shrikhand","Basundi","Rabri","Payasam","Kesari","Rasmalai","Malpua","Chikki","Milk Cake","Balushahi","Imarti","Cham Cham","Sandesh"};

String personalCare[] = {"Soap","Shampoo","Conditioner","Toothpaste","Toothbrush","Face Wash","Face Cream","Body Lotion","Hand Wash","Sanitizer","Deodorant","Perfume","Hair Oil","Face Scrub","Sunscreen","Shaving Cream","Razor","Lip Balm","Talcum Powder","Face Mask","Hair Gel","Hair Serum","Body Spray","Foot Cream","Hand Cream"};

String householdItems[] = {"Detergent","Dish Wash","Floor Cleaner","Toilet Cleaner","Broom","Mop","Dustbin","Scrubber","Cleaning Cloth","Garbage Bags","Insect Spray","Room Freshener","Phenyl","Bleach","Sponge","Bucket","Wiper","Laundry Bar","Mosquito Repellent","Gloves","Soap Stand","Dust Pan","Doormat","Plastic Box","Storage Container"};

String babyProducts[] = {"Baby Soap","Baby Shampoo","Baby Lotion","Baby Oil","Baby Powder","Diapers","Wipes","Feeding Bottle","Pacifier","Baby Food","Cerelac","Baby Cream","Baby Toothpaste","Baby Toothbrush","Baby Towel","Baby Napkin","Baby Carrier","Baby Walker","Baby Blanket","Baby Soap Bar","Baby Massage Oil","Baby Rash Cream","Baby Bib","Baby Shampoo Mild","Baby Feeding Spoon"};

String stationery[] = {"Notebook","Pen","Pencil","Eraser","Sharpener","Scale","Marker","Highlighter","Sketch Pen","Stapler","Paper Clips","Glue","Fevicol","Chart Paper","White Board Marker","File","Folder","Envelope","Calculator","Diary","Sticky Notes","Drawing Book","Color Pencils","Crayons","Pen Stand"};

String petFood[] = {"Dog Food","Cat Food","Fish Food","Bird Food","Puppy Food","Kitten Food","Dog Biscuits","Cat Treats","Pet Milk","Pet Shampoo","Pet Soap","Pet Collar","Pet Leash","Pet Bowl","Pet Toys","Pet Bed","Pet Vitamins","Pet Supplements","Pet Litter","Pet Cage","Pet Grooming Brush","Pet Nail Cutter","Pet Training Pads","Pet Blanket","Pet Water Bottle"};

String meatAndSeafood[] = {"Chicken","Mutton","Fish","Prawns","Crab","Eggs","Turkey","Duck","Salmon","Tuna","Sardine","Pomfret","Lobster","Squid","Clams","Oysters","Beef","Pork","Keema","Fish Fillet","Chicken Wings","Chicken Sausage","Fish Curry Cut","Shrimp","Crab Meat"};

String electronics[] = {"Television","Refrigerator","Washing Machine","Microwave Oven","Mixer Grinder","Electric Kettle","Rice Cooker","Induction Stove","Ceiling Fan","Table Fan","Air Conditioner","Water Purifier","Vacuum Cleaner","Iron Box","Hair Dryer","Laptop","Desktop Computer","Printer","Router","Mobile Phone","Power Bank","Smart Watch","Bluetooth Speaker","Earphones","Extension Box"};

String vegetables[] = {"Carrot","Beans","Tomato","Raddish","Ladies Fingure","Cabbage","Cauli flower","Bringel","Potato","Beetroot","Brcoli","Cucumber","Onion","Drum Stick","Bitter guard","Red chilli","Green chilli","Capsicum","cassava","Soya Beans","baby Corn","Pumpkin","Garlic","Ginger","Mushromm"};

String fruits[] = {"Banana","Apple","water melon","Straw berry","Musk melon","Chikku","Mango","orange","Grapes","Kiwi","Avacado","Pomogranet ","Guava","Jack fruit","Blue Berry ","Rasberry","Termerind","Custurd Apple","Pine apple","Cherry","Coconut","Dates","Papaya","Peach","Pear"};

String perfumes[] = {"Bella Vita White Oud Eau De Parfum","Park Avenue Knight Eau De Parfum","DGZ Party Night Eau De Parfum ","Renee Dark Desire Eau De Parfum","The Man Company Blanc Body Parfum","La French Bestow Eau De Parfum For Men","Carlton London Blush Limited Edition","La French Influencer Eau De Perfume Spray","Ajmal Neea Eau De Parfum","Wipro Softouch 2X French Perfume Fabri","Grace Perfumed Talc","Skinn By Titan Raw Eau De Perfume For Men","Ramsons U.R.Awesome Pour Femme Eau De","Nivea Fresh Natural Roll On","Police To Be Body Spray Deodorant For Men","Kamasutra Spark Men","Skinn By Titan Verge Eau De Perfume","Bryan & Candy New York Japanese Cherry","Nivea Natural Glow Deodorant Roll On","Nivea Fresh Natural Deodoran","Fogg Extreme Fragrance Body Spray "};

String stationary[] = {"pen","pencil","sharpner","Long Scale","Eraser","Compass","Geometry","Protractor","Steel scale","Penpencil","Lead","Long book","king size book","Ruled Book","Unruled book","Classmate book","Sketch pen","Gum","Gum tape","Whitner","Gliter pen","Stepler","Slam Book","Dairy ","Drwaing Book"};

String riceAndGrains[] = {"Basmati Rice","Brown Rice","White Rice","Red Rice","Black Rice","Wheat","Barley","Oats","Millets","Ragi","Jowar","Bajra","Maize","Quinoa","Sorghum","Foxtail Millet","Little Millet","Barnyard Millet","Kodo Millet","Proso Millet","Pearl Millet","Finger Millet","Broken Wheat","Rice Flakes","Corn Grits"};

String meats[] = {"Form chiken","Nati chiken","Tyson Chiken","Pork","Mutton","Lamb","jelly fish","anjal fish","Bangude fish","Buthayi Fish","Crab","Squid","Stake","prawns","Sea shell","Tuna Fish","Caveir","Salmon","octopus","oyster","cuttelfish","Liver","Heart","Brain","Intestines"};

String toys[] = {"Chess Board","Business Board","Carrom board","Snake and Ladder","Ludo Board","Lego set","Hot Wheels","Rubiqs cube","Bow and Arrow","Water Gun","Shooting guns","Dot","Bubble Gun","Cricket Bat","Batmiton","ball","Cars","Bikes","Trucks","Tractor","Remote control Cars","Babrie set","Cooking set ","Doll House","phones(dumachale phone)"};

String electricApplianse[] = {"Iron Box","Toaster","Electric stove","Grinder","Owven","Vaccum cleaner","Hair Drier","kettel","ear phone","Fans","Extension Box","Charging cable","Mixer","coffee maker","Speaker","LED bulb","Chapathi maker","Tube Light","Table Fan"};

System.out.println("Health Products:");
for (String healthProductName : healthProducts) {
	System.out.println(healthProductName);
}

System.out.println("\nTravel Accessories:");
for (String travelAccessoryName : travelAccessories) {
    System.out.println(travelAccessoryName);
}

System.out.println("\nParty Supplies:");
for (String partySupplyName : partySupplies) {
    System.out.println(partySupplyName);
}

System.out.println("\nHardware Items:");
for (String hardwareItemName : hardwareItems) {
    System.out.println(hardwareItemName);
}

System.out.println("\nLighting And Electrical Accessories:");
for (String lightingAndElectricalAccessoryName : lightingAndElectricalAcessories) {
    System.out.println(lightingAndElectricalAccessoryName);
}

System.out.println("\nPuja Items:");
for (String pujaItemName : pujaItems) {
    System.out.println(pujaItemName);
}

System.out.println("\nSnacks And Namkeen:");
for (String snackOrNamkeenName : snacksAndNamkeen) {
    System.out.println(snackOrNamkeenName);
}

System.out.println("\nSweets:");
for (String sweetName : sweets) {
    System.out.println(sweetName);
}

System.out.println("\nPersonal Care Products:");
for (String personalCareProductName : personalCare) {
    System.out.println(personalCareProductName);
}

System.out.println("\nHousehold Items:");
for (String householdItemName : householdItems) {
    System.out.println(householdItemName);
}

System.out.println("\nBaby Products:");
for (String babyProductName : babyProducts) {
    System.out.println(babyProductName);
}

System.out.println("\nStationery Items:");
for (String stationeryItemName : stationery) {
    System.out.println(stationeryItemName);
}

System.out.println("\nPet Food And Accessories:");
for (String petFoodName : petFood) {
    System.out.println(petFoodName);
}

System.out.println("\nMeat And Seafood:");
for (String meatAndSeafoodItemName : meatAndSeafood) {
    System.out.println(meatAndSeafoodItemName);
}

System.out.println("\nElectronics:");
for (String electronicItemName : electronics) {
    System.out.println(electronicItemName);
}

System.out.println("\nVegetables:");
for (String vegetableName : vegetables) {
    System.out.println(vegetableName);
}

System.out.println("\nFruits:");
for (String fruitName : fruits) {
    System.out.println(fruitName);
}

System.out.println("\nPerfumes:");
for (String perfumeName : perfumes) {
    System.out.println(perfumeName);
}

System.out.println("\nStationary Items:");
for (String stationaryItemName : stationary) {
    System.out.println(stationaryItemName);
}

System.out.println("\nRice And Grains:");
for (String riceOrGrainName : riceAndGrains) {
    System.out.println(riceOrGrainName);
}

System.out.println("\nMeats:");
for (String meatName : meats) {
    System.out.println(meatName);
}

System.out.println("\nToys:");
for (String toyName : toys) {
    System.out.println(toyName);
}

System.out.println("\nElectric Appliances:");
for (String electricApplianceName : electricApplianse) {
    System.out.println(electricApplianceName);
}

}

}





