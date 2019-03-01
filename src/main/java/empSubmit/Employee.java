package empSubmit;

public class Employee {
	private long id;
	private String name;
	
	public Employee(long id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public long getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public boolean setName(String name) {
		//add logic to check valid name
		this.name=name;
		return true;
	}	
}
