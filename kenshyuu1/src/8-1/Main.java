public class Main {
	public static void main (String[] args) {
		// 勇者の生成（インスタンス化)
		Hero h = new Hero();
		h.name = "貴士";
		h.hp = 100;
		
		// 魔物の生成(インスタンス化)
		Monster m = new Monster();
		m.hp = 50;
		m.level = 10;
		
		// 勇者と魔物の動作を表示
		System.out.println("Hero's Name: " + h.name);
		System.out.println("Hero's HP: " + h.hp);
		System.out.println("Monster's HP: " + m.hp);
		System.out.println("Monster's Level: " + m.level);
		
	}
}