package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number_triangles = 10;
        Triangles triangles = new Triangles();
        for (int i = 0; i < number_triangles; i++) {
            triangles.add(new EquilateralTriangle(random.nextInt(5)));
        }
        System.out.println("Tреугольники с площадью, большей средней площади всех треугольников:\n" + triangles.get_List_triangles_square_lager_average_square());
        int number_pyramid = 10;
        Pyramids pyramids = new Pyramids();
        for (int i = 0; i < number_pyramid; i++) {
            pyramids.add(new RightPyramid(random.nextInt(5), random.nextInt(5)));
        }
        System.out.println("Пирамида с наибольшим обьемом:" + pyramids.get_pyramid_max_volume());
    }
}
