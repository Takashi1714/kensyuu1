package chapter6_final_assignment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] : >");
		
		int choice = scanner.nextInt(); //ユーザー入力を取得
		
        switch (choice) {
        case 0:
            //Circleオブジェクトを生成して円を描画
        	Circle circle = new Circle(100, 100, 20); // 中心点(100, 100)、半径20の円
        	circle.draw();
        	System.out.println("周囲の長さは、" + circle.getPerimeter());
            
            break;
        case 2:
        	// Lineオブジェクトを生成して線を描画
        	Line line = new Line(0, 0, 100, 100); //始点(0, 0), 終点(100, 100)の線
        	line.draw();
            System.out.println("線の長さは、" + line.getPerimeter());
            break;
        case 3:
        	// Triangleオブジェクトを生成して三角形を描画
        	Triangle triangle = new Triangle(0, 0, 100, 100, 0, 200); // 点1(0, 0), 点2(100, 100), 点3(0, 200)
        	triangle.draw();
        	System.out.println("三角形の周囲の長さは、" + triangle.getPerimeter());
            break;
        case 4:
        	// Rectanngleオブジェクトを作成して長方形を描画
        	Rectangle rectangle = new Rectangle(0, 0, 100, 50); //点(0, 0), 幅100, 高さ50の長方形
        	rectangle.draw();
            System.out.println("長方形の周囲の長さは、" + rectangle.getPerimeter());
            break;
        case 44:
        	// Squareオブジェクトを生成して正方形を描画
        	Square square = new Square(new Point(0, 0), 200); //点(0, 0), 幅・高さ200の正方形
        	square.draw();
            System.out.println("[正方形を描画] 点(0,0)を基準として幅・高さ100の正方形");
            break;
        default:
            System.out.println("不正な入力です。プログラムを終了します。");
            break;
    }
		
		scanner.close(); //スキャナーを閉じる
		
	}
	
}