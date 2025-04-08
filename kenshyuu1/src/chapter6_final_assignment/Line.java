package chapter6_final_assignment;

public class  Line implements Figure{
	//始点を表すPoint型のprivateフィールドの定義
	private Point p1;
	private Point p2;
	
	//p1(x,y) p2(x,y)を全て0で初期化する。
	public Line() {
		this.p1 = new Point(0,0);
		this.p2 = new Point(0,0);
	}
	
   //引数で受け取ったデータをp1,p2に代入する。
	public Line(int x1,int y1,int x2,int y2) {
		this.p1 = new Point (x1,y1);
		this.p2 = new Point (x2,y2);
		
	}
	
	@Override
	//メッセージの出力と図形描画
	public void draw() {
		System.out.println("[線を描画]始点("+p1.getX() + "," + p1.getY() + ")から終点("+ p2.getX() + "," + p2.getY() + ")まで");
		
	}
	
	//距離を計算するメソッド
    public double getPerimeter() {
    	return Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2) + Math.pow(p2.getY()-p1.getY(), 2));
    }
    
	
	
}