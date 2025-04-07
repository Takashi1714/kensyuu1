package chapter6_final_assignment;

public abstract class Circle extends Shape {
	
	private Point  center;
	private int radious;
	
	
	public Circle() {
		this.center = new Point(0,0);
		this.radious = 0;
	}
	
	//引数x,yで受け取ったデータを用いてPointオブジェクトを生成しcenterフィールドに代入する。引数rもradiousフィールドに代入する。
	public Circle(int x, int y, int r) {
		this.center = new Point(x,y);
		this.radious = r;
		
	}
	
	//円のデータを表示する
	public void draw() {
		System.out.println("以下のようなメッセージを表示する。");
		System.out.println("[円を描画]中心点("+center.getX() + "," + center.getY() + ")から半径" + radious);
	}
	
	//円周を計算して返す。
	public double getPerimeter() {
		
		return radious*2*Math.PI;
		
		
	}
	
	
}
