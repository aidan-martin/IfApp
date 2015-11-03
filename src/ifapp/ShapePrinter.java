/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifapp;

/**
 *
 * @author aidanmartin
 */
public class ShapePrinter {

    public static void printTriangle(int size) {
        for (int line = 1; line <= size; line++) {
            for (int star = 0; star < line; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        printRectangle(width, height, "*");
//        for (int line = 1; line <= height; line++) {
//            for (int octothrope = 1; octothrope <= width; octothrope++) {
//                System.out.print("#");
//            }
//            System.out.println("");
//        }

    }

    public static void printSquare(int side) {
        ShapePrinter.printRectangle(side, side);
        
    }

    public static void printRectangle(int width, int height, String character) {
        for (int line = 1; line <= height; line++) {
            for (int octothrope = 1; octothrope <= width; octothrope++) {
                System.out.print(character);
            }
            System.out.println("");
        }
    }
}
