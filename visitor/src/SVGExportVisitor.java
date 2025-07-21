public class SVGExportVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("<circle r=\"" + circle.getRadius() + "\" />");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("<rect width=\"" + rectangle.getWidth()
                         + "\" height=\"" + rectangle.getHeight() + "\" />");
    }
}