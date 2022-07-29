package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    Circle(String color, double radius) {
        super(Color.valueOf(color));
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, "
                + "area: "      + getArea() + " sq.units, "
                + "radius: "    + radius    + " sq.units, "
                + "color: "     + getColor();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
