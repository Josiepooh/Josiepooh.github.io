package category_one;

public class business {
	
	private int id, cert, date;
	private String name, result, sector;
	
	public business(int id, int cert, String name, int date, String result, String sector) {
		this.id = id;
		this.cert = cert;
		this.name = name;
		this.date = date;
		this.result = result;
		this.sector = sector;
	}
	
	public void findBusiness() {
		System.out.println("ID: " + id + " , Certificate #: " + cert + " , Name: " + name + " , Date: " + date + " , Result: " + result + " , Sector: " + sector);
	}
	
	public int getID() {
		return id;
	}
	
	public int getCert() {
		return cert;
	}
	
	public int getDate() {
		return date;
	}
	
	public String getName() {
		return name;
	}
	
	public String getResult() {
		return result;
	}
	
	public String getSector() {
		return sector;
	}
	
	public void setID(int id) {
		this.id = id;
		System.out.println("New ID: " + this.id);
	}
	
	public void setCert(int cert) {
		this.cert = cert;
		System.out.println("New Certificate: " + this.cert);
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("New Name: " + this.name);
	}
	
	public void setDate(int date) {
		this.date = date;
		System.out.println("New Date: " + this.date);
	}
	
	public void setResult(String result) {
		this.result = result;
		System.out.println("New Result: " + this.result);
	}
	
	public void setSector(String sector) {
		this.sector = sector;
		System.out.println("New Sector: " + this.sector);
	}
	
}
