package tda551.adapter;

import java.awt.Graphics;
import tda551.shapes.Point;

public interface IPolygon {
    void paint(Graphics g);

    void updateCenter(int newX, int newY);

    Point getCenter();
}
