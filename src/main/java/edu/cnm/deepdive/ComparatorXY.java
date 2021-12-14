package edu.cnm.deepdive;

import edu.cnm.deepdive.geometry.Point;
import java.util.Comparator;

public class ComparatorXY implements Comparator<Point> {

  public int compare(Point point1, Point point2) {
    int value = 1;
    if (point1.getX() != point2.getX()) {
      if (point1.getX() < point2.getX()) {
        return value * -1;
      }
    }
    return value;
  }

}
