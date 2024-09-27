import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        PharmacyShop p1 = new PharmacyShop(new Address("48", "Lahore", "54000"), 10, new Person("Ali", "03194013359"));
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        while (true) {
            System.out.println("-----------MENU-----------");
            System.out.println("Select the Option you want to choose:");
            System.out.println("1. Search by ID");
            System.out.println("2. Add new Medicine");
            System.out.println("3. Remove a Medicine");
            System.out.println("4. Sell Medicine");
            System.out.println("5. Display all Medicines");
            System.out.println("6. Print Total Revenue");
            System.out.println("7. Identify Expired Meds");
            System.out.println("8. Update Medicine");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()

            switch (choice) {
                case 1:
                    System.out.println("Enter the ID of the medicine you want to search:");
                    String pID = scanner.nextLine();
                    p1.searchById(pID);
                    break;
                    case 5:
                    for (int i=0;i<=10;i++){
                        p1.list[i].Display();
                    }
                    
            }
            if (choice == 9) {
                break;
                
            }
           

        }
    }
}
