package br.com.fiap.ticketpurchase;

public class Passenger {
		private int id;
		private String name;
		private String rg;
		private String email;
		
		public Passenger(int id, String name, String rg, String email) {
			this.id = id;
			this.name = name;
			this.rg = rg;
			this.email = email;
		}
		
		public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getRg() {
	        return rg;
	    }

	    public void setRg(String rg) {
	        this.rg = rg;
	    }

	    public String getEmail() {
	        return email;
	    }

}
