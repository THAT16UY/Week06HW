package week06HW;

public class Card {
	
	private int value;
	private String name;
	
	Card(){}
	Card(int invalue, String inname){
		value = invalue;
		name = inname;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int v) {
		this.value = v;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String describe() {
		String str1 = "It is a " + this.getName() + ".\n";
		String str2 = "Value: " + this.getValue() + "\n";
		return str1 + str2;
	}

}
