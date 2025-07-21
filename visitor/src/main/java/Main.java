import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
            new Circle(5.0),
            new Rectangle(4.0, 3.0)
        );

        Visitor svgExporter = new SVGExportVisitor();

        for (Shape shape : shapes) {
            shape.accept(svgExporter);
        }
    }
}
