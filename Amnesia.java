import java.util.List;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Amnesia.java
//  @ Date : 2022. 03. 27.
//  @ Author : 
//
//




/** 
 * Az amnézia olyan ágens amelytől az áldozat elfelejti a már megismert genetikai kódokat, 
 * ezeket újra meg tudja később tanulni a hozzájuk tartozó laboratóriumok meglátogatásával.
 * */

public class Amnesia extends Agent {
	private String name;
	
	/** 
 	* A konstruktor beállítja az objektum nevét, csak tesztelési célra.
 	* */
	
	public Amnesia(String _name) {
		name = _name;
	}
	
	/** 
	 * A függvény a paraméterként kapott virológusokra megpróbálja az ágenst rákenni és kiváltani a hatását: 
	 * elfelejteti a virológussal az eddig megtanult genetikai kódjait.
	 * */
	
	public void causeEffect(List<Virologist> targets, Virologist source) {
		main.increaseIndentation();
		System.out.println(main.printIndentation() + "->" + name + ".causeEffect()");
		
		for(int i=0;i<targets.size();i++) {
			Virologist t = targets.get(i);
			if(t.infect(this, source)) {
				t.forgetGeneticCodes();
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
