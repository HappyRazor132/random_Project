class Point {
    protected double x, y;
    private int quad;

    public Point (double x, double y) {
            this.x = x;
            this.y = y;

            quadrent();
    }

    public double distanceFromOrigin() {
            return Math.sqrt(x*x + y*y);
    }
    
    protected  void  quadrent(){
            if (x > 0 && y > 0)
                    quad = 1;
            else if (x > 0 && y < 0)
                    quad = 4;
            else if (x< 0 && y >0)
                    quad = 2;
            else
                    quad = 3;	
    }

    int getQuadrant(){
            return quad;
    }
}
