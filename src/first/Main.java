package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Введи количество прямоугольников");
            int n = in.nextInt();
            for(int i = 0;i<n;i++){
                System.out.println("Введи точки прямоугольника x1 y1 x2 y2");
                int x1 = in.nextInt();
                int y1 = in.nextInt();
                int x2 = in.nextInt();
                int y2 = in.nextInt();
                Rectangle rect = new Rectangle(new Point(x1, y1), new Point(x2, y2));
                rectangles.add(rect);
            }
        }
        int area=sumArea(rectangles)- sumCrossedArea(rectangles);

        System.out.println("Площадь без лишних пересечений: "+area);

    }
    private static int sumArea(List<Rectangle> rectangles){
        int sum = 0;
        for (Rectangle rectangle : rectangles) {
            sum += rectangle.getArea();
        }
        return sum;
    }
    private static int sumCrossedArea(List<Rectangle> rectangles){
        int sum=0;
        for (int i = 0; i < rectangles.size(); i++) {
            for(int j=0;j<rectangles.size();j++){
                if(i!=j){
                    sum+= rectangles.get(i).getCrossedArea(rectangles.get(j));
                }
            }
        }
        return sum;
    }

}
