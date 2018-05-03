package com.minoj.maths;

import java.util.Scanner;

public class Main {

    private static final Vector2D gravity_vector = new Vector2D(0.0f,-9.81f);
    private static final Vector3D gravity_vector_3d = new Vector3D(0.0f,-9.81f,0.0f);
    private static final Scanner input = new Scanner(System.in);

    private static Vector2D vector_2d_1 = null;
    private static Vector2D vector_2d_2 = null;
    private static Vector3D vector_3d_1 = null;
    private static Vector3D vector_3d_2 = null;

    public static void main(String[] args) {

        boolean cont = true; // Loop Condition variable

        // If user wants to continue the program cont = true, else cont = false and therefore exit the program
        while(cont) {

            // Call Menu to Run Program
            //menu();

            //part_a();

            System.out.println("\n");

            //part_b();

            part_c();

            System.out.println("\n");

            char choice;
            System.out.print("\nDo you want to continue? (Y/N)");
            choice = input.next().charAt(0);

            if(choice == 'n' || choice == 'N') {
                cont = false;
            } else {
                continue;
            }
        }

    }

    private static void menu() {

        System.out.println("\n1. Create a 2D Vector\n2. Create a 3D Vector\n3. 2D Vector Addition\n4. 3D Vector Addition\n5. 2D Vector Subtraction\n6. 3D Vector Subtraction\n7. 2D Vector Dot Product");
        System.out.println("8. 3D Vector Dot Product\n9. Unit Normal Vector of 2D Vector\n10. Unit Normal Vector of 3D Vector\n11. 2D Vector Magnitude\n12. 3D Vector Magnitude");
        System.out.print("13. 2D Vector Multiply by Scalar\n14. 3D Vector Multiply by Scalar\n15. 2D Vector Rotation\n0. Exit\n\nInput Option: ");

        int option = input.nextInt();

        switch (option) {

            // Create a 2D Vector
            case 1: {
                vector_2d();
                break;
            }

            // Create a 3D Vector
            case 2: {
                vector_3d();
                break;
            }

            // Terminate Program
            case 0: {
                System.exit(0);
                break;
            }

            // Add Two 2D Vectors
            case 3: {

                vector_2d_addition();
                break;
            }

            // Add Two 3D Vectors
            case 4: {

                vector_3d_addition();
                break;
            }

            // Subtract Two 2D Vectors
            case 5: {

                vector_2d_subtraction();
                break;
            }

            // Subtract Two 3D Vectors
            case 6: {

                vector_3d_subtraction();
                break;
            }

            // Dot Product of Two 2D Vectors
            case 7: {

                vector_2d_dot_product();
                break;
            }

            // Dot Product Two 3D Vectors
            case 8: {

                vector_3d_dot_product();
                break;
            }

            // Unit Normal of a 2D Vector
            case 9: {

                vector_2d_unit_normal();
                break;
            }

            // Unit Normal of a 3D Vector
            case 10: {

                vector_3d_unit_normal();
                break;
            }

            // Magnitude of a 2D Vector
            case 11: {

                vector_2d_mag();
                break;
            }

            // Magnitude of a 3D Vector
            case 12: {

                vector_3d_mag();
                break;
            }

            // 2D Vector Multiplied by a Scalar
            case 13: {

                vector_2d_scalar_multiply();
                break;
            }

            // 3D Vector Multiplied by a Scalar
            case 14: {

                vector_3d_scalar_multiply();
                break;
            }

            // 2D Vector Rotation
            case 15: {

                vector_2d_rotation();
                break;
            }

        }

    }

    private static void vector_2d() {

        float x;
        float y;
        int option;

        System.out.print("Input X : ");
        x = input.nextFloat();

        System.out.print("Input Y : ");
        y = input.nextFloat();

        System.out.print("Vector 1 OR Vector 2 [1/2] : ");
        option = input.nextInt();

        switch(option) {

            // Create a 2D Vector
            case 1: {

                if(vector_2d_1 == null) {

                    vector_2d_1 = new Vector2D(x,y);

                } else {

                    vector_2d_1.setX(x);
                    vector_2d_1.setY(y);

                }

                break;
            }

            // Create a 2D Vector
            case 2: {

                if(vector_2d_2 == null) {

                    vector_2d_2 = new Vector2D(x,y);

                } else {

                    vector_2d_2.setX(x);
                    vector_2d_2.setY(y);

                }

                break;
            }

            default: {

                System.err.println("Invalid Option!\n");
                break;
            }

        }

    }

    private static void vector_3d() {

        float x;
        float y;
        float z;
        int option;

        System.out.print("Input X : ");
        x = input.nextFloat();

        System.out.print("Input Y : ");
        y = input.nextFloat();

        System.out.print("Input Z : ");
        z = input.nextFloat();

        System.out.print("Vector 1 OR Vector 2 [1/2] : ");
        option = input.nextInt();

        switch(option) {

            case 1: {

                if(vector_3d_1 == null) {

                    vector_3d_1 = new Vector3D(x,y,z);

                } else {

                    vector_3d_1.setX(x);
                    vector_3d_1.setY(y);
                    vector_3d_1.setZ(z);

                }

                break;
            }

            case 2: {

                if(vector_3d_2 == null) {

                    vector_3d_2 = new Vector3D(x,y,z);

                } else {

                    vector_3d_2.setX(x);
                    vector_3d_2.setY(y);
                    vector_3d_2.setZ(z);
                }

                break;
            }

            default: {
                break;
            }

        }
    }

    private static void vector_2d_addition() {

        if(vector_2d_1 != null && vector_2d_2 != null) {

            System.out.println("Addition of Vectors - "+vector_2d_1+" & "+vector_2d_2+" is \n"+Vector2DMaths.add(vector_2d_1,vector_2d_2));

        } else {

            System.err.println("Please create *2* 2D Vectors");

        }

    }

    private static void vector_3d_addition() {

        if(vector_3d_1 != null && vector_3d_2 != null) {

            System.out.println("Addition of Vectors - "+vector_3d_1+" & "+vector_3d_2+" is \n"+Vector3DMaths.add(vector_3d_1,vector_3d_2));

        } else {

            System.err.println("Please create *2* 3D Vectors");

        }

    }

    private static void vector_2d_subtraction() {

        if(vector_2d_1 != null && vector_2d_2 != null) {

            System.out.println("Subtraction of Vectors - "+vector_2d_1+" & "+vector_2d_2+" is \n"+Vector2DMaths.subtract(vector_2d_1,vector_2d_2));

        } else {

            System.err.println("Please create *2* 2D Vectors");

        }

    }

    private static void vector_3d_subtraction() {

        if(vector_3d_1 != null && vector_3d_2 != null) {

            System.out.println("Subtraction of Vectors - "+vector_3d_1+" & "+vector_3d_2+" is \n"+Vector3DMaths.subtract(vector_3d_1,vector_3d_2));

        } else {

            System.err.println("Please create *2* 3D Vectors");

        }

    }

    private static void vector_2d_dot_product() {

        if(vector_2d_1 != null && vector_2d_2 != null) {

            System.out.println("Dot Product of Vectors - "+vector_2d_1+" & "+vector_2d_2+" is \n"+Vector2DMaths.dotProduct(vector_2d_1,vector_2d_2));

        } else {

            System.err.println("Please create *2* 2D Vectors");

        }

    }

    private static void vector_3d_dot_product() {

        if(vector_3d_1 != null && vector_3d_2 != null) {

            System.out.println("Dot Product of Vectors - "+vector_3d_1+" & "+vector_3d_2+" is \n"+Vector3DMaths.dotProduct(vector_3d_1,vector_3d_2));

        } else {

            System.err.println("Please create *2* 3D Vectors");

        }

    }

    private static void vector_2d_unit_normal() {

        int option;

        System.out.print("Vector 1 OR Vector 2 [1/2] : ");
        option = input.nextInt();

        switch(option) {

            case 1: {

                System.out.println("Unit Normal Vector of Vector - "+vector_2d_1+" is = "+Vector2DMaths.unitNormal(vector_2d_1));
                break;
            }

            case 2: {

                System.out.println("Unit Normal Vector of Vector - "+vector_2d_2+" is = "+Vector2DMaths.unitNormal(vector_2d_2));
                break;
            }
        }

    }

    private static void vector_3d_unit_normal() {

        int option;

        System.out.print("Vector 1 OR Vector 2 [1/2] : ");
        option = input.nextInt();

        switch(option) {

            case 1: {

                System.out.println("Unit Normal Vector of Vector - "+vector_3d_1+" is = "+Vector3DMaths.unitNormal(vector_3d_1));
                break;
            }

            case 2: {

                System.out.println("Unit Normal Vector of Vector - "+vector_3d_2+" is = "+Vector3DMaths.unitNormal(vector_3d_2));
                break;
            }

        }

    }

    private static void vector_2d_mag() {

        int option;

        System.out.print("Vector 1 OR Vector 2 [1/2] : ");
        option = input.nextInt();

        switch(option) {

            case 1: {

                System.out.println("Magnitude of Vector - "+vector_2d_1+" is = "+Vector2DMaths.magnitude(vector_2d_1));
                break;
            }

            case 2: {

                System.out.println("Magnitude of Vector - "+vector_2d_2+" is = "+Vector2DMaths.magnitude(vector_2d_2));
                break;
            }

        }

    }

    private static void vector_3d_mag() {

        int option;

        System.out.print("Vector 1 OR Vector 2 [1/2] : ");
        option = input.nextInt();

        switch(option) {

            case 1: {

                System.out.println("Magnitude of Vector - "+vector_3d_1+" is = "+Vector3DMaths.magnitude(vector_3d_1));
                break;
            }

            case 2: {

                System.out.println("Magnitude of Vector - "+vector_3d_2+" is = "+Vector3DMaths.magnitude(vector_3d_2));
                break;
            }

        }

    }

    private static void vector_2d_scalar_multiply() {

        int option;
        float scalar;

        System.out.print("Vector 1 OR Vector 2 [1/2] : ");
        option = input.nextInt();

        System.out.print("Input Scalar Quantity : ");
        scalar = input.nextFloat();

        switch(option) {

            case 1: {

                System.out.println("Vector - "+vector_2d_1+" multiplied by Scalar - "+scalar+" is = "+Vector2DMaths.scalarMultiply(vector_2d_1,scalar));
                break;
            }

            case 2: {

                System.out.println("Vector - "+vector_2d_2+" multiplied by Scalar - "+scalar+" is = "+Vector2DMaths.scalarMultiply(vector_2d_2,scalar));
                break;
            }
        }

    }

    private static void vector_3d_scalar_multiply() {

        int option;
        float scalar;

        System.out.print("Vector 1 OR Vector 2 [1/2] : ");
        option = input.nextInt();

        System.out.print("Input Scalar Quantity : ");
        scalar = input.nextFloat();

        switch(option) {

            case 1: {

                System.out.println("Vector - "+vector_3d_1+" multiplied by Scalar - "+scalar+" is = "+Vector3DMaths.scalarMultiply(vector_3d_1,scalar));
                break;
            }

            case 2: {

                System.out.println("Vector - "+vector_3d_2+" multiplied by Scalar - "+scalar+" is = "+Vector3DMaths.scalarMultiply(vector_3d_2,scalar));
                break;
            }
        }

    }

    private static void vector_2d_rotation() {

        int option;
        float angle;

        System.out.print("Vector 1 OR Vectoe 2 [1/2] : ");
        option = input.nextInt();

        System.out.print("Input Angle of Rotation (Degrees) : ");
        angle = input.nextFloat();

        switch(option) {

            case 1: {

                System.out.println("Rotation of Vector - "+vector_2d_1+" by an Angle of "+angle+" is = "+Vector2DMaths.rotation(vector_2d_1,angle));
                break;
            }

            case 2: {

                System.out.println("Rotation of Vector - "+vector_2d_2+" by an Angle of "+angle+" is = "+Vector2DMaths.rotation(vector_2d_2,angle));
                break;
            }

        }

    }

    /**
     * Answer for the First Question
     * 2D Trajectory
     */
    private static void part_a() {
        float speed; // Speed of Trajectory in Metres/Seconds
        float angle; // Angle of Projection in Degress
        float time_step; // Time Step in Seconds

        // Speed of Trajectory
        System.out.print("Input Speed (m/s) : ");
        speed = input.nextFloat();

        // Angle of Projection
        System.out.print("Input Angle of Trajectory (degrees) : ");
        angle = input.nextFloat();

        // Time Step
        System.out.print("Input Time Step (seconds) : ");
        time_step = input.nextFloat();

        // Position Vector - Trajectory Begins at 0,0 => x,y
        Vector2D position_vector = new Vector2D(0.0f,0.0f);

        // Velocity Vector - Requires the Speed and Angle
        // Do we have to find the Resultant of the Vector?
        Vector2D velocity_vector = Vector2DMaths.velocityVec(speed,angle);

        int i = 1;

        System.out.println("Time Step : "+time_step+"\n");

        while(position_vector.getY() >= 0.0f) {

            // Velocity Vector during Trajectory | v = u + at
            velocity_vector.setX((velocity_vector.getX() + (gravity_vector.getX() * time_step)));
            velocity_vector.setY((velocity_vector.getY() + (gravity_vector.getY() * time_step)));

            System.out.println(i+" | Velocity Vector : "+velocity_vector);

            // Position Vector during Trajectory | s = ut + 1/2at*t => Position X = Old Position X + velocity vector * t & Position Y = Old Position Y + (velocity vector * t) + (a * t * t) /2
            position_vector.setX((position_vector.getX() + (velocity_vector.getX() * time_step)));
            position_vector.setY((position_vector.getY() + (velocity_vector.getY() * time_step) + (gravity_vector.getY() * time_step * time_step)/2));

            System.out.println(i+" | Position Vector : "+position_vector+"\n");

            i++;
        }

    }

    /**
     * Answer for the Second Question
     * Trajectory and Impulse
     */
    private static void part_b() {

        float impulse_time;
        Vector3D force_vector = new Vector3D();
        float weight;
        float time_step;

        System.out.print("Input Time of Impulse Applied (seconds) : ");
        impulse_time = input.nextFloat();

        System.out.print("Input Force Vector X : ");
        force_vector.setX(input.nextFloat());

        System.out.print("Input Force Vector Y : ");
        force_vector.setY(input.nextFloat());

        System.out.print("Input Force Vector Z : ");
        force_vector.setZ(input.nextFloat());

        System.out.print("Input Weight of Object : ");
        weight = input.nextFloat();

        System.out.print("Input Time Step (seconds) : ");
        time_step = input.nextFloat();

        // Impulse = Force * Time
        Vector3D impulse = Vector3DMaths.scalarMultiply(force_vector,impulse_time);

        // Impulse = Force * Time = Mass * Change in Velocity (V - U) where U = 0m/s
        Vector3D velocity_vector = Vector3DMaths.scalarMultiply(impulse,(float)1/weight);

        Vector3D position_vector = new Vector3D(0.0f,0.0f,0.0f);

        int i = 0;

        while(position_vector.getY() >= 0.0f) {

            // Velocity Vector during Trajectory
            velocity_vector.setX(velocity_vector.getX() + (gravity_vector_3d.getX()*time_step));
            velocity_vector.setY(velocity_vector.getY() + (gravity_vector_3d.getY()*time_step));
            velocity_vector.setZ(velocity_vector.getZ() + (gravity_vector_3d.getZ()*time_step));

            System.out.println(i+" | Velocity Vector : "+velocity_vector);

            // Position Vector during Trajectory
            position_vector.setX(position_vector.getX() + (velocity_vector.getX()*time_step));
            position_vector.setY(position_vector.getY() + (velocity_vector.getY()*time_step) + ((gravity_vector.getY()*time_step*time_step)/2));
            position_vector.setZ(position_vector.getZ() + (velocity_vector.getZ()*time_step));

            System.out.println(i+" | Position Vector : "+position_vector+"\n");


            i++;

        }

    }

    private static void part_c() {

        Vector2D velocity_vector_cue = new Vector2D();
        Vector2D velocity_vector_object = new Vector2D();
        Vector2D position_cue = new Vector2D();
        Vector2D position_object = new Vector2D();
        Vector2D rotational_damping = new Vector2D(0.0f,-0.1f); // Deceleration

        float angle;
        float weight_cue_ball;
        float weight_object_ball;
        float radius = 2.9f; //centimetres
        float time_step;

        System.out.print("Input Velocity Vector X : ");
        velocity_vector_cue.setX(input.nextFloat());

        System.out.print("Input Velocity Vector Y : ");
        velocity_vector_cue.setY(input.nextFloat());

        System.out.print("Input Angle (Degrees) : ");
        angle = input.nextFloat();

        System.out.print("Weight of Cue Ball (KG) : ");
        weight_cue_ball = input.nextFloat();

        System.out.print("Weight of Object Ball (KG) : ");
        weight_object_ball = input.nextFloat();

        System.out.print("Input Position X of Object Ball (Greater than 0) : ");
        position_object.setX(input.nextFloat());

        System.out.print("Input Position Y of Object Ball (Greater than 0) : ");
        position_object.setY(input.nextFloat());

        System.out.print("Input Time Step (seconds) : ");
        time_step = input.nextFloat();

        int i = 0;

        while(position_cue.getY() + 2.9f <= position_object.getY()) {

            // Velocity Vector of Cue Ball - v = u + at
            velocity_vector_cue.setX((velocity_vector_cue.getX() ) + (rotational_damping.getX() * time_step));
            velocity_vector_cue.setY((velocity_vector_cue.getY() ) + (rotational_damping.getY() * time_step));

            System.out.println(i+" | Velocity Vector of Cue Ball : "+velocity_vector_cue);

            // Position Vector of Cue Ball - s = ut + 1/2at*t
            position_cue.setX(position_cue.getX() + (velocity_vector_cue.getX() * time_step)); // s = ut
            position_cue.setY(position_cue.getY() + (velocity_vector_cue.getY() * time_step) + (rotational_damping.getY() * time_step * time_step)/2); // s = ut + 1/2at*t

            System.out.println(i+" | Position Vector of Cue Ball : "+position_cue+"\n");

            i++;

        }

        i= 0;

        // Calculate Velocity of Object Ball
        // Resolve to Y Axis
        velocity_vector_object = Vector2DMaths.velocityVec((float)(velocity_vector_cue.getY() * Math.sin(Math.toRadians(30))),30);

        while(velocity_vector_object.getX() > 0 && velocity_vector_object.getY() > 0) {

            // Velocity Vector of Object Ball - v = u + at
            velocity_vector_object.setX(velocity_vector_object.getX() + (rotational_damping.getX() * time_step));
            velocity_vector_object.setY(velocity_vector_object.getY() + (rotational_damping.getY() * time_step));

            System.out.println(i+" | Velocity Vector of Object Ball : "+velocity_vector_object);

            // Position Vector of Object Ball - s = ut + 1/2at*t
            position_object.setX(position_object.getX() + (velocity_vector_object.getX() * time_step) );
            position_object.setY(position_object.getY() + (velocity_vector_object.getY() * time_step) + (rotational_damping.getY() * time_step * time_step)/2);

            System.out.println(i+" | Position Vector of Object Ball : "+position_object+"\n");

            i++;
        }


    }

}
