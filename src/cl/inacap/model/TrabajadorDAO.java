package cl.inacap.model;

import java.util.ArrayList;
import java.util.List;

public class TrabajadorDAO {
	private static List<Trabajador> listaTrabajadores = new ArrayList<Trabajador>();
	
	public void save(Trabajador tr) {
		this.listaTrabajadores.add(tr);
	}
	public List<Trabajador> getAll(){
		return this.listaTrabajadores;
	}
}
