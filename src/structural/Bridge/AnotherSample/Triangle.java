package structural.Bridge.AnotherSample;

public class Triangle implements Figure {

    private Color color;

    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public void getColor() {
        color.setColor();
        System.out.print(" triangle");
    }
}
