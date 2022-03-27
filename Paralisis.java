import java.util.List;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Paralisis.java
//  @ Date : 2022. 03. 27.
//  @ Author : 
//
//




/** */
public class Paralisis extends Agent {
	private String name;
	
	public Paralisis(String _name) {
		name = _name;
	}
	
	/** */
	public void causeEffect(List<Virologist> targets, Virologist source) {
		main.increaseIndentation();
		System.out.println(main.printIndentation() + "->" + name + ".causeEffect()");
		
		for(int i=0;i<targets.size();i++) {
			Virologist t = targets.get(i);
			if(t.infect(this, source)) {
				t.setParalyzed(true);
			}
		}
		System.out.println(main.printIndentation() + "<-");
		main.decreaseIndentation();
	}
	
	/** */
	public void step() {
	}
}
