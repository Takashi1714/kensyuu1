package chapter5.program1;

class Sales extends Employee{
	
	public Sales(String name, String department){
		super(name, department);
		
	}
	
	
	//週報返信メソッド
	public void replyweeklyReport() {
		System.out.println("週報の返信をした");
	}
	
	//面談を組むメソッド(引数: エンジニア)
	public void scheduleMeeting(Engineer engineer) {
		System.out.println(engineer.getName() + "の面談を組んだ");
		
	}
	
	//打合せメソッド
	public void holdMeeting() {
		System.out.println("新規の打合せをした");
	}
	
	//情報表示メソッド
	@Override
	protected void displayInfo() {
		System.out.println(getName() + ":" + getDepartment());
	}
	
}
	