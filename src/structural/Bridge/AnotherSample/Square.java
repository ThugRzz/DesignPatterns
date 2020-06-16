package structural.Bridge.AnotherSample;

public class Square implements Figure {
    private Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void getColor() {
        color.setColor();
        System.out.print(" square");
    }

}
