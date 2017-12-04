package tda551.adapter;

import tda551.shapes.Polygon;
import tda551.shapes.Point;

import java.awt.Graphics;

/* package-private */ class PolygonWrapper implements IPolygon {
    private Polygon wrappedPolygon;

    PolygonWrapper(Polygon toBeWrapped) {
        this.wrappedPolygon = toBeWrapped;
    }

    @Override
    public void paint(Graphics g) {
        wrappedPolygon.paint(g);
    }

    /* This is where the magic happens */
    @Override
    public void updateCenter(int newX, int newY) {
        Point oldCenter = wrappedPolygon.getCenterPoint();
        wrappedPolygon.translate(newX - oldCenter.getX(), newY - oldCenter.getY());
    }

    @Override
    public Point getCenter() {
        return wrappedPolygon.getCenterPoint();
    }
}
