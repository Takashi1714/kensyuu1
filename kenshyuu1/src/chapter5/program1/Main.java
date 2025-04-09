package chapter5.program1;


public class Main {
	public static void main(String[] args) {
        BT bt = new BT();

         // 従業員の作成
        HumanResource hr = new HumanResource("田中", "人事");
        Sales sales = new Sales("佐藤", "営業");
        Engineer engineer = new Engineer("鈴木", "エンジニア", "Java");

        // 従業員リストに追加
        bt.employeeList.add(hr);
        bt.employeeList.add(sales);
        bt.employeeList.add(engineer);

        // 従業員情報表示
        bt.displayAllEmployees();

        // 面接の実施
        hr.conductInterview(true, bt, "鈴木", "エンジニア", "Java");

        // 給与計算の実施
        hr.calculateSalary();

        // 週報の返信
        sales.replyweeklyReport();

        // 面談の組み立て
        sales.scheduleMeeting(engineer);

        // 開発の実施
        engineer.develop();
     }
}
