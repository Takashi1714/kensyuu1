package chapter6_final_assignment;

public abstract class Shape implements Figure {
	//図形描画機能
	public abstract void draw();
	
   //長さ測定機能の定義
	public abstract double getPerimeter(); 
}


