import java.util.List;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Chorea.java
//  @ Date : 2022. 03. 27.
//  @ Author : 
//
//




/** 
 * A vírustánc olyan ágens amely vitustáncot okoz: az áldozat kontrollálatlanul, 
 * véletlenszerű mozgással kezd el haladni, ezalatt a játékos nem tudja irányítani. 
 * */

public class Chorea extends Agent {
	
	private String name;
	
	/** 
 	* A konstruktor beállítja az objektum nevét, csak tesztelési célra.
 	* */
	
	public Chorea(String _name) {
		name = _name;
	}
	
	/** 
	 * A függvény a paraméterként kapott virológusokra megpróbálja az ágenst rákenni és kiváltani a hatását: 
	 * a virológus kontrollálatlanul, véletlenszerű mozgással kezd el haladni, ezalatt a játékos nem tudja irányítani. 
	 * */
	
	public void causeEffect(List<Virologist> targets, Virologist source) {
		main.increaseIndentation();
		System.out.println(main.printIndentation() + "->" + name + ".causeEffect()");
		
		for(int i=0;i<targets.size();i++) {
			Virologist t = targets.get(i);
			if(t.infect(this, source)) {
				t.setChorea(true);
			}
		}
		System.out.println(main.printIndentation() + "<-");
		main.decreaseIndentation();
	}
	
	/** 
	 * A Steppable interfészből implementált step() függvény. Az idő múlásának hatását valósítja meg.
	 * */
	
	public void step() {
	}

}
