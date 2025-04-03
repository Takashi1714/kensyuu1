package chapter5.program1;

class Engineer extends Employee {
    private String language;

    public Engineer(String name, String language) {
        super(name, "エンジニア");
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void develop() {
    	System.out.println(language + "で開発を行った");
    }

    @Override
    void displayInfo() {
        System.out.println(getName() + "：" + getDepartment() + " 使用言語：" + language);
    }
}
