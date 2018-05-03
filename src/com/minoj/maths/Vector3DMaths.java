package com.minoj.maths;

public class Vector3DMaths {

    /**
     * Add Two 3D Vectors : vec1 + vec2
     * @param vec1 3D Vector 1 containing the X,Y and Z
     * @param vec2 3D Vector 2 containing the X,Y and Z
     * @return The 3D Addition Vector of 3D Vector 1 and 3D Vector 2
     */
    public static Vector3D add(Vector3D vec1, Vector3D vec2) {
        Vector3D vector = new Vector3D(vec1.getX()+vec2.getX(),vec1.getY()+vec2.getY(), vec1.getZ()+vec2.getZ());
        return vector;
    }

    /**
     * Subtract Two 3D Vector : vec1 - vec2
     * @param vec1 3D Vector 1 containing the X,Y and Z
     * @param vec2 3D Vector 2 containing the X,Y and Z
     * @return The 3D Subtraction Vector of 3D Vector 1 and 3D Vector 2
     */
    public static Vector3D subtract(Vector3D vec1, Vector3D vec2) {
        Vector3D vector = new Vector3D(vec1.getX()-vec2.getX(),vec1.getY()-vec2.getY(),vec1.getZ()-vec2.getZ());
        return vector;
    }

    /**
     * Calculate the Dot Product of Two 3D Vectors
     * a.b = x1.x2 + y1.y2 + z1.z2
     * @param vec1 3D Vector 1
     * @param vec2 3D Vector 2
     * @return The dot product of 3D Vector 1 and 3D Vector 2
     */
    public static double dotProduct(Vector3D vec1, Vector3D vec2) {
        double dot_product = (vec1.getX() * vec2.getX()) + (vec1.getY() * vec2.getY()) + (vec1.getZ() * vec2.getZ());

        return dot_product;
    }

    /**
     * Calculate the Unit Normal Vector of the given 3D Vector
     * vector_normal = vector / |vector|
     * @param vector 3D Vector of which the Unit normal needs to be calculated
     * @return The Unit Normal Vector of the given 3D Vector
     */
    public static Vector3D unitNormal(Vector3D vector) {
        double mag_a = (float)Math.sqrt((vector.getX()*vector.getX())+(vector.getY()+vector.getY())+(vector.getZ()*vector.getZ()));
        return new Vector3D((float)(vector.getX()/mag_a),(float)(vector.getY()/mag_a),(float)(vector.getZ()/mag_a));
    }

    /**
     * Calculate the Magnitude of the given 3D Vector
     * Magnitude of Vector a : |a| = ~/i*i+j*j
     * @param vector 3D Vector of which the magnitude needs to be calculated
     * @return The magnitude of the 3D Vector
     */
    public static double magnitude(Vector3D vector) {
        double magnitude = Math.sqrt((vector.getX()*vector.getX())+(vector.getY()*vector.getY())+(vector.getZ()*vector.getZ()));
        return magnitude;
    }

    /**
     * Multiply the given 3D Vector by the Specified Scalar Quantity
     * @param vector 3D Vector to be multiplied
     * @param scalar Scalar Quantity by which the 3D Vector needs to be multiplied
     * @return The 3D Vector resulting from the multiplication of the provided 3D Vector and Scalar Quantity
     */
    public static Vector3D scalarMultiply(Vector3D vector, float scalar) {
        return new Vector3D(vector.getX()*scalar,vector.getY()*scalar,vector.getZ()*scalar);
    }

}
