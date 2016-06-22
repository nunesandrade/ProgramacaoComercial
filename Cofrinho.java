package aulaGit;

import java.util.LinkedList;
import java.util.List;

public class Cofrinho {
private List <Moeda> Moeda = new LinkedList<Moeda>();

public Cofrinho(List<Moeda> Moeda){
	this.Moeda = Moeda;	
}
public void adicionar (Moeda m){
this.Moeda.add(m);

}
	public double CaucularTotal(){
	double CaucularTotal = 0;
	for(Moeda m: Moeda){
	CaucularTotal += m.getValor();
		
	}
	return CaucularTotal;
	
	}

}
