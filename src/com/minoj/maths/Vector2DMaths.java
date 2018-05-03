package com.minoj.maths;

public class Vector2DMaths {

    /**
     * Add Two 2D Vector : vec1 + vec2
     * @param vec1 2D Vector 1 containing the X and Y
     * @param vec2 2D Vector 2 containing the X and Y
     * @return The 2D Addition Vector of 2D Vector 1 and 2D Vector 2
     */
    public static Vector2D add(Vector2D vec1, Vector2D vec2) {
        Vector2D vector = new Vector2D(vec1.getX()+vec2.getX(),vec1.getY()+vec2.getY());
        return vector;
    }

    /**
     * Subtract Two 2D Vector : vec1 - vec2
     * @param vec1 2D Vector 1 containing the X and Y
     * @param vec2 2D Vector 2 containing the X and Y
     * @return The 2D Subtraction Vector of 2D Vector 1 and 2D Vector 2
     */
    public static Vector2D subtract(Vector2D vec1, Vector2D vec2) {
        Vector2D vector = new Vector2D(vec1.getX()-vec2.getX(),vec1.getY()-vec2.getY());
        return vector;
    }

    /**
     * Calculate the Dot Product of Two 2D Vectors
     * a.b = x1.x2 + y1.y2
     * @param vec1 2D Vector 1
     * @param vec2 2D Vector 2
     * @return The dot product of 2D Vector 1 and 2D Vector 2
     */
    public static double dotProduct(Vector2D vec1, Vector2D vec2) {
        //a.b = x1*x2 + y1*y2
        double dot_product = (vec1.getX() * vec2.getX()) + (vec1.getY() * vec2.getY());
        return dot_product;
    }

    /**
     * Calculate the Unit Normal Vector of the given 2D Vector
     * vector_normal = vector / |vector|
     * @param vector 2D Vector of which the Unit normal needs to be calculated
     * @return The Unit Normal Vector of the given 2D Vector
     */
    public static Vector2D unitNormal(Vector2D vector) {
        double mag_a = (float)Math.sqrt((vector.getX()*vector.getX())+(vector.getY()+vector.getY()));
        return new Vector2D((float)(vector.getX()/mag_a),(float)(vector.getY()/mag_a));
    }

    /**
     * Calculate the Magnitude of the given 2D Vector
     * Magnitude of Vector a : |a| = ~/i*i+j*j
     * @param vector 2D Vector of which the magnitude needs to be calculated
     * @return The magnitude of the 2D Vector
     */
    public static double magnitude(Vector2D vector) {
        double magnitude = Math.sqrt((vector.getX()*vector.getX())+(vector.getY()*vector.getY()));
        return magnitude;
    }

    /**
     * Calculate the 2D Vector after rotating the given vector by the specified angle
     * @param vector 2D Vector to be rotated
     * @param angle Angle by which the 2D Vector needs to be rotated
     * @return The 2D Vector after being rotated by the given angle
     */
    public static Vector2D rotation(Vector2D vector, double angle) {
        double x = Math.cos(angle)*vector.getX() - Math.sin(Math.toRadians(angle))*vector.getY();
        double y = Math.sin(angle)*vector.getX() + Math.cos(Math.toRadians(angle))*vector.getY();
        return new Vector2D((float)x,(float)y);
    }

    /**
     * Multiply the given 2D Vector by the Specified Scalar Quantity
     * @param vector 2D Vector to be multiplied
     * @param scalar Scalar Quantity by which the 2D Vector needs to be multiplied
     * @return The 2D Vector resulting from the multiplication of the provided 2D Vector and Scalar Quantity
     */
    public static Vector2D scalarMultiply(Vector2D vector, float scalar) {
        return new Vector2D(vector.getX()*scalar,vector.getY()*scalar);
    }

    /**
     * Calculate the Velocity Vector of the given Vector
     * @param speed Speed of movement of the Vector
     * @param angle Angle of movement of the Vector
     * @return The Velocity Vector of the given Vector moving at the specified speed in the given direction (angle)
     */
    public static Vector2D velocityVec(float speed, float angle) {

        float velocityVecX;
        float velocityVecY;

        velocityVecX = (float) Math.cos(Math.toRadians(angle)) * speed;
        velocityVecY = (float) Math.sin(Math.toRadians(angle)) * speed;

        return new Vector2D(velocityVecX,velocityVecY);
    }
}
