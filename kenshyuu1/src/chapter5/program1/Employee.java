package chapter5.program1;

abstract class Employee extends BT{
	//プライベート属性
	private String name;
	private String department;


    //コンストラクタ
    public Employee(String name, String department) {
    	this.name = name;
    	this.department = department;
    }
    
    //プライベート属性のゲッターメソッド
    public String getName() {
    	return name;
    	
    }
    
    public String getDepartment() {
    	return department;
    }
    
    //情報表示の抽象メソッド
    protected void displayInfo() {
    	System.out.println("名前: " + getName());
    	System.out.println("部署: " + getDepartment());
    }
}

