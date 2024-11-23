package org.example.question1;

public class GamePlatform {

    public static double getFinalSpeed(double initialSpeed, int[] inclinations) {
        for (int inclination : inclinations) {
            initialSpeed -= inclination;
        }
        return initialSpeed;
    }

    public static void main(String[] args){
        System.out.println(getFinalSpeed(60.0, new int[] { 0, -30, 0, 45, 0 })); //should print 45
    }
}
