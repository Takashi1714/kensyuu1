package chapter6_final_assignment;


// サブクラスの定義
public class Square extends Rectangle{
	
	public Square(Point point, int width) {
		// スーパークラスRectangleのコンストラクタを明示的に呼び出し
		super(point.getX(), point.getY(), width, width);
		 
	}
	
	public void draw() {
		System.out.println("[正方形を描画]点(0,0)を基準として幅・高さ200の正方形");
		
	}

}



