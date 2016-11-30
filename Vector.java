public class Vector {
    public Point vect;
    public double mag;
    public double dir;
    
    public Vector(){
    }
    
    public Vector(Point p){
        this.vect = p;
    }
    
    public double getMagnitude(){
        return this.vect.distanceFromOrigin();
    }
    
    public double direction(){
        double theta;
        theta = Math.atan(this.vect.y/this.vect.x);
        return theta;
    }
}

