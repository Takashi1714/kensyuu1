package chapter5.program1;

class HumanResource extends Employee {
    public HumanResource(String name) {
        super(name, "人事");
    }

    public void interview(String result) {
        System.out.println("面接を行い、結果は" + result + "だった");
        if (result.equals("採用")) {
            // BT/DE.従業員作成メソッドを使用して従業員を採用する
        }
    }

    public void calculateSalary() {
        System.out.println("給与計算を行った");
    }

    @Override
    void displayInfo() {
        System.out.println(getName() + "：" + getDepartment());
    }
}

        
