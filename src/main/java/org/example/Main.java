package org.example;

public class Main {
    public static boolean getRandomBoolean()
    {
        return Math.random() < 0.5;
    }
    public static boolean[][] generateImage()
    {
        boolean[][] image = new boolean[10][10];
        for(int i = 0; i < 10; ++i)
        {
            for(int j = 0; j < 10; ++j)
            {
                image[i][j] = getRandomBoolean();
            }
        }
        return image;
    }
    public static void printImage(boolean[][] image)
    {
        for(int i = 0; i < 10; ++i)
        {
            for(int j = 0; j < 10; ++j)
            {
                System.out.printf("%d ", image[i][j] == true ? 1 : 0);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Camera s = new Camera();
        boolean[][] image = generateImage();
        System.out.println("First image");
        printImage(image);
        s.SetImage(image);

        CameraObserver c_obs = new CameraObserver();
        c_obs.Enable(s);

        image = generateImage();
        System.out.println("Second image");
        printImage(image);
        s.SetImage(image);

        c_obs.Disable(s);
    }
}