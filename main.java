import java.util.*;

public class main {
	private static int indentation = 0;
	public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	int x = MenuData();
    	System.out.printf("You have chosen: %d\n", x);
    	
    	switch(x) {
    	case 1:
    		break;
    	case 2:
    		break;
    	case 3:
    		break;
    	case 4:
    		attackChorea();
    		break;
    	case 5:
    		break;
    	case 6:
    		break;
    	case 7:
    		break;
    	case 8:
    		break;
    	case 9:
    		break;
    	case 10:
    		break;
    	case 11:
    		break;
    	case 12:
    		break;
    	case 13:
    		break;
    	case 14:
    		break;
    	case 15:
    		break;
    	default :
    		System.out.println("Invalid selection.");
    		break;
    	}
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
    	selection = sc.nextInt();
    	return selection;
    }
    
    public static void increaseIndentation() {
    	indentation++;
    }
    
    public static void decreaseIndentation() {
    	if(indentation-- < 0) {
    		indentation = 0;
    	}
    }
    
    public static void resetIndentation() {
    	indentation = 0;
    }
    
    public static String printIndentation() {
    	String s = "";
    	for(int i=0;i<indentation;i++) {
    		s += "\t";
    	}
    	return s;
    }
    
    public static void attackChorea() {
    	System.out.println("Virologist attacks with chorea");
    	Virologist v1 = new Virologist();
    	Virologist v2 = new Virologist();
    	Chorea c = new Chorea();
    	Bag b = new Bag();
    	LabCoat l = new LabCoat();
    	Gloves g = new Gloves();
    	
    	v2.addGear(b);
    	v2.addGear(l);
    	v2.addGear(g);
    	
    	List<Virologist> targets = new ArrayList<Virologist>();
    	targets.add(v2);
    	v1.useAgent(targets, c);
    }
}