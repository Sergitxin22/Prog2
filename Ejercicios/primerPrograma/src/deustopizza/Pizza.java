package deustopizza;

import java.util.ArrayList;

public class Pizza {
	// Atributos
	private int tamanyo;
	private int masa;
	private String salsa;
	private boolean gratinar;
	private ArrayList<Ingrediente> ingredientes;

	// Metodos
	public Pizza(int tamanyo, int masa, String salsa, boolean gratinar, ArrayList<Ingrediente> ingredientes) {
		super();
		this.tamanyo = tamanyo;
		this.masa = masa;
		this.salsa = salsa;
		this.gratinar = gratinar;
		this.ingredientes = new ArrayList<Ingrediente>(ingredientes);
	}

	

	public Pizza() {
		super();
		this.tamanyo = 0;
		this.masa = 0;
		this.salsa = "tomate";
		this.gratinar = false;
		this.ingredientes = new ArrayList<Ingrediente>();
	}

	public Pizza(Pizza p) {
		super();
		this.tamanyo = p.tamanyo;
		this.masa = p.masa;
		this.salsa = p.salsa;
		this.gratinar = p.gratinar;
		this.ingredientes = new ArrayList<Ingrediente>(p.ingredientes);
	}

	public int getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}

	public int getMasa() {
		return masa;
	}

	public void setMasa(int masa) {
		this.masa = masa;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	public boolean isGratinar() {
		return gratinar;
	}


	public void setGratinar(boolean gratinar) {
		this.gratinar = gratinar;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public String toString() {
		String resultado="Pizza";

		if(this.tamanyo==0) {
			resultado+="pequeña";
		} else if(this.tamanyo==1) {
			resultado+="mediana";
		} else {
			resultado+="grande";
		}

		resultado+=", masa ";

		if(this.masa==0) {
			resultado+="fina";
		} else if(this.masa==1) {
			resultado+="normal";
		} else {
			resultado+="pan";
		}

		resultado+=", salsa "+this.salsa;

		if(this.gratinar){
			resultado+=", gratinada.\n";
		} else {
			resultado+=", sin gratinar.\n";
		}
		
		resultado+="Ingredientes: ";

		return resultado;
	}
}
