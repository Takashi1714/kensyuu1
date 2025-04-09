package chapter5.program1;

class Engineer extends Employee{
	//プライベート属性
	private String Language;


    //コンストラクタ
    public Engineer(String name, String department, String Language) {
    	super(name, department);
    	this.Language = Language;
    	
    }
    
    //プライベート属性のゲッターメソッド
    public String  getLanguage() {
    	return Language;
    }
    
    //開発実施メソッド
    public void develop() {
    	System.out.println(getLanguage() + "で開発を行った");
    }
    
    //抽象メソッドの実装
    @Override
    protected void displayInfo() {
    	System.out.println(getName() + ":" + getDepartment() + " 使用言語:" + getLanguage());
    }
    
}