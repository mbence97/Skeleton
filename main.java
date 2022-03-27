import java.util.Scanner;

public class main {
	
    public static void main(String[] args) {
    	
    	int x = MenuData();
    	
    	System.out.printf("You have chosen: %d", x);
    }

    public static int MenuData() {
    	int selection;
    	System.out.println("1. Virologist picks up bag");
    	System.out.println("2. Virologist picks up gloves");
    	System.out.println("3. Virologist picks up labcoat");
    	System.out.println("4. Virologist attacks with chorea");
    	System.out.println("5. Virologist attacks with paralisis");
    	System.out.println("6. Virologist attacks with amnesia");
    	System.out.println("7. Virologist uses vaccine");
    	System.out.println("8. Virologist steals");
    	System.out.println("9. Virologist moves");
    	System.out.println("10. Virologist creates amnesia");
    	System.out.println("11. Virologist creates paralisis");
    	System.out.println("12. Virologist creates chorea");
    	System.out.println("13. Virologist creates vaccine");
    	System.out.println("14. Virologist interacts with lab");
    	System.out.println("15. Virologist picks up materials");
    	System.out.print("Select scenario: ");
    	Scanner sc = new Scanner(System.in);
    	selection = sc.nextInt();
    	return selection;
    }
}