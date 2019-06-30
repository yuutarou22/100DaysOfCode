class Point {
    double x, y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getDistanceFromOrigin(Point p) {
        return Math.sqrt(x*x + y*y);
    }

    public double getDistanceBetweenTwoPoints(Point p0, Point p1) {
        return Math.sqrt(Math.pow((p0.x - p1.x),2) + Math.pow((p0.y - p1.y),2));
    }

    public Point getBarycenter(Point[] points) {
        double sumX, sumY;
        sumX = sumY = 0;

        for (Point p : points) {
            sumX = p.x;
            sumY = p.y;
        }

        return new Point(sumX/points.length, sumY/points.length);
    }
}