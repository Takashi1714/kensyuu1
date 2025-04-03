public class Main{
	public static void main(String[] args) {
		
		// 勇者の生成（インスタンス化)
		Hero h = new Hero();
		h.name = "貴士";
		h.hp = 100;
		 
		// 魔法使いの生成(インスタンス化)
		Wizard w = new Wizard();
		w.name = "たかし";
		w.hp = 50;
		System.out.println(w.hp);
		System.out.println(w.name);	
		
	    w.heal(h); //貴士を回復させる
	    
		
	}
}