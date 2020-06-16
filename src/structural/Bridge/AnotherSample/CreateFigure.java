package structural.Bridge.AnotherSample;

public class CreateFigure {
    public static void main(String[] args) {
        Figure redSquare = new Square(new RedColor());
        redSquare.getColor();
        System.out.println("");
        Figure blueSquare = new Square(new BlueColor());
        blueSquare.getColor();
        System.out.println("");
        Figure blueTriangle = new Triangle(new BlueColor());
        blueTriangle.getColor();
    }
}
