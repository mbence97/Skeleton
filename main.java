import java.util.*;

public class main {
	private static int indentation = 0;
	public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	int x = MenuData();
    	System.out.printf("You have chosen: %d\n", x);
    	
    	switch(x) {
    	case 1:
    		picksUpBag();
    		break;
    	case 2:
    		picksUpGloves();
    		break;
    	case 3:
    		picksUpLabcoat();
    		break;
    	case 4:
    		attackChorea();
    		break;
    	case 5:
    		attackParalisis();
    		break;
    	case 6:
    		attackAmnesia();
    		break;
    	case 7:
    		useVaccine();
    		break;
    	case 8:
    		steal();
    		break;
    	case 9:
    		move();
    		break;
    	case 10:
			createAmnesia();
    		break;
    	case 11:
			createChorea();
    		break;
    	case 12:
			createVaccine();
    		break;
    	case 13:
			createParalisis();
    		break;
    	case 14:
			labInteract();
			break;
    	case 15:
    		pickUpMaterial();
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
    
    public static void picksUpBag() {
    	System.out.println("Virologist picks up bag");
    	System.out.println("Initializing:");
    	Virologist v = new Virologist("v");
    	Bag b = new Bag ("b");
    	Shelter s = new Shelter("s");	
    	s.addVirologist(v);
    	v.setField(s);	
    	s.setGear(b);
    	System.out.println("Start:");
    	v.fieldInteract();
    }
    
    public static void picksUpGloves() {
    	System.out.println("Virologist picks up gloves");
    	System.out.println("Initializing:");
    	Virologist v = new Virologist("v");
    	Shelter s = new Shelter("s");
    	Gloves g = new Gloves ("g");
    	s.addVirologist(v);
    	v.setField(s);	
    	s.setGear(g);
    	System.out.println("Start:");
    	v.fieldInteract();
    }
    
    public static void picksUpLabcoat() {
    	System.out.println("Virologist picks up labcoat");
    	System.out.println("Initializing:");
    	Virologist v = new Virologist("v");
    	Shelter s = new Shelter("s");
    	LabCoat l = new LabCoat ("l");
    	s.addVirologist(v);
    	v.setField(s);	
    	s.setGear(l);
    	System.out.println("Start:");
    	v.fieldInteract();
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
    	System.out.println("Initializing:");
    	Virologist v1 = new Virologist("v1");
    	Virologist v2 = new Virologist("v2");
    	Chorea c = new Chorea("c");
    	Bag b = new Bag("b");
    	LabCoat l = new LabCoat("l");
    	Gloves g = new Gloves("g");
    	
    	v2.addGear(b);
    	v2.addGear(l);
    	v2.addGear(g);
    	
    	System.out.println("Start:");
    	List<Virologist> targets = new ArrayList<Virologist>();
    	targets.add(v2);
    	v1.useAgent(targets, c);
    }
    
    public static void attackParalisis() {
    	System.out.println("Virologist attacks with paralisis");
    	System.out.println("Initializing:");
    	Virologist v1 = new Virologist("v1");
    	Virologist v2 = new Virologist("v2");
    	Paralisis p = new Paralisis("p");
    	Bag b = new Bag("b");
    	LabCoat l = new LabCoat("l");
    	Gloves g = new Gloves("g");
    	
    	v2.addGear(b);
    	v2.addGear(l);
    	v2.addGear(g);
    	
    	System.out.println("Start:");
    	List<Virologist> targets = new ArrayList<Virologist>();
    	targets.add(v2);
    	v1.useAgent(targets, p);
    }
    
    public static void attackAmnesia() {
    	System.out.println("Virologist attacks with amnesia");
    	System.out.println("Initializing:");
    	Virologist v1 = new Virologist("v1");
    	Virologist v2 = new Virologist("v2");
    	Amnesia a = new Amnesia("a");
    	Bag b = new Bag("b");
    	LabCoat l = new LabCoat("l");
    	Gloves g = new Gloves("g");
    	
    	v2.addGear(b);
    	v2.addGear(l);
    	v2.addGear(g);
    	
    	System.out.println("Start:");
    	List<Virologist> targets = new ArrayList<Virologist>();
    	targets.add(v2);
    	v1.useAgent(targets, a);
    }
    
    public static void useVaccine() {
    	System.out.println("Virologist uses vaccine");
    	System.out.println("Initializing:");
    	System.out.println("1. Virologist uses vaccine on themselves.");
    	System.out.println("2. Virologist uses vaccine on another virologist. (Default)");
    	System.out.print("Choose one of these scenarios: ");
    	int selection = sc.next().charAt(0);
    	
    	if(selection == '1') {
    		Virologist v1 = new Virologist("v1");
    		Vaccine v = new Vaccine("v");
    		
    		System.out.println("Start:");
        	List<Virologist> targets = new ArrayList<Virologist>();
        	targets.add(v1);
        	v1.useAgent(targets, v);
    	}else {
    		Virologist v1 = new Virologist("v1");
        	Virologist v2 = new Virologist("v2");
        	Vaccine v = new Vaccine("v");
        	
        	System.out.println("Start:");
        	List<Virologist> targets = new ArrayList<Virologist>();
        	targets.add(v2);
        	v1.useAgent(targets, v);
    	}
    }
    
    public static void steal() {
    	System.out.println("Virologist steals");
    	System.out.println("Initializing:");
    	
    	Virologist v1 = new Virologist("v1");
    	Virologist v2 = new Virologist("v2");
		System.out.print(main.printIndentation() + "Is the target paralyzed? (y/n): ");
    	if(main.sc.next().charAt(0) == 'y') {
    		v2.setParalyzed(true);
    	}
    	Bag b = new Bag("b");
    	LabCoat l = new LabCoat("l");
    	Gloves g = new Gloves("g");
    	
    	b.onPickup(v2);
    	v2.addGear(l);
    	v2.addGear(g);
    	v2.addAminoacid(5);
    	v2.addNucleotid(3);
    	
    	System.out.println("Start:");
    	v1.stealFrom(v2);
    }
    
    public static void move() {
    	System.out.println("Virologist moves");
    	System.out.println("Initializing:");
    	
    	Virologist v = new Virologist("v");
    	Field f1 = new Field("f1");
    	Field f2 = new Field("f2");
		System.out.print(main.printIndentation() + "Is the target paralyzed? (y/n): ");
    	if(main.sc.next().charAt(0) == 'y') {
    		v.setParalyzed(true);
    	}else {
    		System.out.print(main.printIndentation() + "Is the target infected with chorea? (y/n): ");
        	if(main.sc.next().charAt(0) == 'y') {
        		v.setChorea(true);
        	}
    	}
    	
    	v.setField(f1);
    	
    	System.out.println("Start:");
    	v.move(f2);
    }

	public static void createAmnesia() {
		System.out.println("Virologist creates amnesia.");
		System.out.println("Initializing:");

		Virologist v = new Virologist("v");
		v.addGeneticCode(new A());

		System.out.print("How many aminoacids does the virologist have? (0-5): " );
		v.addAminoacid(sc.nextInt());

		System.out.print("How many nucleotids does the virologist have? (0-5): " );
		v.addNucleotid(sc.nextInt());

		System.out.println("Start:");
		v.createAgent("amnesia");
	}

	public static void createChorea() {
		System.out.println("Virologist creates chorea.");
		System.out.println("Initializing:");

		Virologist v = new Virologist("v");
		v.addGeneticCode(new C());

		System.out.print("How many aminoacids does the virologist have? (0-5): " );
		v.addAminoacid(sc.nextInt());

		System.out.print("How many nucleotids does the virologist have? (0-5): " );
		v.addNucleotid(sc.nextInt());

		System.out.println("Start:");
		v.createAgent("chorea");
	}

	public static void createVaccine() {
		System.out.println("Virologist creates vaccine.");
		System.out.println("Initializing:");

		Virologist v = new Virologist("v");
		v.addGeneticCode(new V());

		System.out.print("How many aminoacids does the virologist have? (0-5): " );
		v.addAminoacid(sc.nextInt());

		System.out.print("How many nucleotids does the virologist have? (0-5): " );
		v.addNucleotid(sc.nextInt());

		System.out.println("Start:");
		v.createAgent("vaccine");
	}

	public static void createParalisis() {
		System.out.println("Virologist creates paralysis.");
		System.out.println("Initializing:");

		Virologist v = new Virologist("v");
		v.addGeneticCode(new P());

		System.out.print("How many aminoacids does the virologist have? (0-5): " );
		v.addAminoacid(sc.nextInt());

		System.out.print("How many nucleotids does the virologist have? (0-5): " );
		v.addNucleotid(sc.nextInt());

		System.out.println("Start:");
		v.createAgent("paralisis");
	}

	public static void labInteract() {
		System.out.println("Virologist interacts with laboratory.");
		System.out.println("Initializing:");

		Virologist v = new Virologist("v");
		Laboratory l = new Laboratory("l");

		l.addGeneticCode(new A());
		v.setField(l);

		System.out.println("Start:");
		v.fieldInteract();
	}
	
	public static void pickUpMaterial() {
		System.out.println("Virologist picks up materials");
		System.out.println("Initializing:");
		Virologist v = new Virologist("v");
    	Storage s = new Storage("s");
    	s.addVirologist(v);
    	s.setMaterials(3, 3);
    	v.setField(s);	
    	System.out.println("Start:");
    	v.fieldInteract();
	}
	
}