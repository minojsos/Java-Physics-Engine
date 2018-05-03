package com.minoj.maths;

public class Vector2D {

    private float x;
    private float y;

    public Vector2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Assign a value to X of the 2D Vector
     * @param x Value to be assigned
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Assign a value to Y of the 2D Vector
     * @param y Value to be assigned
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Retrieve the X of the 2D Vector
     * @return X value of the 2D Vector
     */
    public float getX() {
        return this.x;
    }

    /**
     * Retireve the Y of the 2D Vector
     * @return Y value of the 2D Vector
     */
    public float getY() {
        return this.y;
    }

    /**
     * Convert the current 2D Vector to String
     * Display the 2D Vector in the following format:
     * ( x, y )
     * @return 2D Vector data in the format: ( x, y )
     */
    public String toString() {
        return "( "+this.getX()+", "+this.getY()+" )";
    }

}
