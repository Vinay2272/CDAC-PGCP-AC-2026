package Enum;

public enum enumClass {
	distinction(80,100),first(65,79),second(50,64),pass(40,49),fail(0,39);
	
	private int min;
	private int max;
	
	private enumClass(int min,int max) {
		System.out.println("in enum class constructor"+min+"---"+max);
		this.min=min;
		this.max=max;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getMin() {
		return min;
	}
}
