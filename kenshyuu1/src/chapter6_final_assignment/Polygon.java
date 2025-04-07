package chapter6_final_assignment;

public abstract class Polygon extends Shape {

    //内角(辺)の数を表すprotectedフィールド
    protected int angle;
    
    //図形描画機能の定義
    public abstract void draw();
    
    
    //長さ測定機能の定義
    public abstract double getPerimeter();
    
    //angleフィールドを使い、内角の和を算出する
    public int getInernalAngle(){
      return (angle-2)*180;
    }
    

}