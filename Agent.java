import java.util.List;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Agent.java
//  @ Date : 2022. 03. 27.
//  @ Author : 
//
//




/** */
public abstract class Agent implements Steppable {
	/** */
	public abstract void causeEffect(List<Virologist> targets, Virologist source);
	
	/** */
	public void step() {
	}
}
