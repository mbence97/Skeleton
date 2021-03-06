//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : C.java
//  @ Date : 2022. 03. 27.
//  @ Author : 
//
//




/** 
 * A genetikus kódok osztálya. Leírja mennyi anyagra (aminosav és nukleotid) van szükség a Chorea ágens előállításához, 
 * és elkészíti ha a virológusnak van elegendő anyaga. 
 * */

public class C extends GeneticCode {
	
	/** 
	 * A konstruktor beállítja a megfelelő paramétereket a működéshez.
	 * */
	
    public C() {requiredNucleotid = 1; requiredAminoacid = 2; agent = new Chorea("c"); name = "C";}
}
