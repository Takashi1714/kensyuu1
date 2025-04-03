package chapter5.program1;

public class Main {
    public static void main(String[] args) {
        BT bt = new BT();

        HumanResource tanaka = new HumanResource("田中");
        Sales sato = new Sales("佐藤");
        Engineer suzuki = new Engineer("鈴木", "Java");

        bt.createEmployee(tanaka);
        bt.createEmployee(sato);
        bt.createEmployee(suzuki);

        bt.displayAllEmployees();
        
        tanaka.interview("採用");
        tanaka.calculateSalary();
        sato.replyWeeklyReport();
        sato.arrangeMeeting(suzuki);
        suzuki.develop();
    }
}

