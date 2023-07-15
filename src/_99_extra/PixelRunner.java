package _99_extra;

public class PixelRunner {
	public static void main(String[] args) {

		PixelParty party = new PixelParty();

		party.setColor(100, 150, 250);

party.drawRectangle(100,50,100,100);
party.drawRectangle(200,100,300,100);

party.drawCircle(200, 200, 50);
party.drawCircle(300, 150, 75);

party.drawTriangle(150, 150, 400, 300, 50, 300);
party.drawTriangle(10, 10, 400, 500, 200, 40);


party.saveImage();

party.displayImage();


	}
}
