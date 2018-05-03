package com.minoj.maths;

public class Vector3D {

    private float x;
    private float y;
    private float z;

    public Vector3D() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
    }

    public Vector3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Assign a value to X of the 3D Vector
     * @param x Value to be assigned
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Assign a value to Y of the 3D Vector
     * @param y Value to be assigned
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Assign a value to the Z of the 3D Vector
     * @param z Value to be assigned
     */
    public void setZ(float z) {
        this.z = z;
    }

    /**
     * Retrieve the X of the 3D Vector
     * @return X Value of the 3D Vector
     */
    public float getX() {
        return this.x;
    }

    /**
     * Retrieve the Y of the 3D Vector
     * @return Y value of the 3D Vector
     */
    public float getY() {
        return this.y;
    }

    /**
     * Retrieve the Z of the 3D Vector
     * @return Z value of the 3D Vector
     */
    public float getZ() {
        return this.z;
    }

    /**
     * Convert the current 3D Vector to String
     * Display the 3D Vector in the following format:
     * ( x, y, z )
     * @return 3D Vector data in the format: ( x, y, z )
     */
    public String toString() {
        return "( "+this.getX()+", "+this.getY()+", "+this.getZ()+" )";
    }

}
