//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : GeneticCode.java
//  @ Date : 2022. 03. 27.
//  @ Author : 
//
//




public class GeneticCode {

	/** */
	protected int requiredNucleotid;

	/** */
	protected int requiredAminoacid;

	/** */
	public Agent agent;

	/** */
	public Laboratory Unnamed3;

	/** */
	public Agent make(Virologist v, int nuc, int acid) {
		if(requiredNucleotid > nuc || requiredAminoacid > acid) {
			return null;
		}
		else {
			v.removeAminoacid(requiredAminoacid);
			v.removeNucleotid(requiredNucleotid);
			return agent;
		}
	}
}
