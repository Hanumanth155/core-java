class OnlineOrder {
    public static void main(String[] args) {

        String orderId = "ORD12345";
        String productName = "Headphones";
        int quantity = 2;
        float deliveryDistanceInKm = 12.5f;
        double totalPrice = 3499.99;
        long customerId = 5566778899L;
        boolean isDelivered = false;
        String paymentMode = "UPI";
        int deliveryDays = 3;
        float orderRating = 4.6f;

        System.out.println("The order ID for this purchase is " + orderId + ".");
        System.out.println("The product ordered is " + productName + ".");
        System.out.println("The quantity of the product ordered is " + quantity + ".");
        System.out.println("The delivery distance for this order is " + deliveryDistanceInKm + " kilometers.");
        System.out.println("The total price of the order is " + totalPrice + " rupees.");
        System.out.println("The customer identification number is " + customerId + ".");
        System.out.println("The delivery status of the order is " + isDelivered + ".");
        System.out.println("The payment mode selected for this order is " + paymentMode + ".");
        System.out.println("The order will be delivered in approximately " + deliveryDays + " days.");
        System.out.println("The customer rating for this order is " + orderRating + " stars.");
    }
}
