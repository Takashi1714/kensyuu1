package chapter5.program1;

import java.util.ArrayList;
import java.util.List;


class BT{
    //会社名
	static final String compnayName ="BT/DE";
	//従業員リスト
	List<Employee> employeeList = new ArrayList<>();
	//部署リスト
	List<String> departmentList = List.of("人事","営業","エンジニア");
	
	//従業員作成メソッド
	protected void createEmployee(String name, String department, String language) {
		Employee newEmployee;
		
		switch (department) {
		   case "エンジニア":
			   newEmployee = new Engineer(name, department, language);
			   break;
		   case "人事":
			   newEmployee = new HumanResource(name, department);
			   break;
		   case "営業":
			   newEmployee = new Sales(name, department);
			   break;
		   default:
			   throw new IllegalArgumentException("無効な部署: " + department);
		}
		employeeList.add(newEmployee);
	}
	
	//従業員情報表示メソッド
	void displayAllEmployees() {
		for(Employee employee : employeeList) {
			employee.displayInfo();
			System.out.println();
		}
	}
		
}




