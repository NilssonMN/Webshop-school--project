import Customer.CustomerController;
import Order.OrderController;
import Product.ProductController;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    CustomerController customerController = new CustomerController();
    ProductController productController = new ProductController();
    OrderController orderController = new OrderController();

    while (running) {
        System.out.println("!=== Huvudmeny ===!");
        System.out.println("1. Hantera kunder");
        System.out.println("2. Hantera produkter");
        System.out.println("3. Hantera ordrar");
        System.out.println("4. Avsluta programmet");
        System.out.print("Välj ett alternativ: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                customerController.runMenu(scanner);
                break;
            case "2":
                productController.runMenu(scanner);
                break;
            case "3":
                orderController.runMenu(scanner);
                break;
            case "4":
                running = false;
                System.out.println("Programmet avslutas...");
                break;
            default:
                System.out.println("Ogiltigt val, försök igen.");
        }
        System.out.println();
    }
    scanner.close();
}