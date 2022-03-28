

/** 
 * A genetikus kódok osztálya. Leírja mennyi anyagra (aminosav és nukleotid) van szükség az Amnesia ágens előállításához, 
 * és elkészíti ha a virológusnak van elegendő anyaga. 
 * */

public class A extends GeneticCode {

	/** 
	 * A konstruktor beállítja a megfelelő paramétereket a működéshez.
	 * */
	
    public A() {requiredNucleotid = 2; requiredAminoacid = 1; agent = new Amnesia("a"); name = "A";}
}
