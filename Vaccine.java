import java.util.List;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Vaccine.java
//  @ Date : 2022. 03. 27.
//  @ Author : 
//
//




/** */
public class Vaccine extends Agent {
private String name;
	
	public Vaccine(String _name) {
		name = _name;
	}
	
	/** */
	public void causeEffect(List<Virologist> targets, Virologist source) {
		main.increaseIndentation();
		System.out.println(main.printIndentation() + "->" + name + ".causeEffect()");
		
		for(int i=0;i<targets.size();i++) {
			Virologist t = targets.get(i);
			t.setVaccinated(true);
		}
		System.out.println(main.printIndentation() + "<-");
		main.decreaseIndentation();
	}
	
	/** */
	public void step() {
	}
}
