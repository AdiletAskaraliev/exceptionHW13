import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        System.out.println("Parallelepiped Number 1 or Cylinder Number 2. Enter number please : ");




        Scanner mainScanner = new Scanner(System.in);
        int shape = mainScanner.nextInt();

        switch (shape){
            case 1:
                System.out.println("Enter data for Parallelepiped - height, length and width : ");

                Scanner scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                Scanner scanner2 = new Scanner(System.in);

                Parallelepiped parallelepiped = new Parallelepiped();

                try {
                    double height = scanner.nextDouble();
                    double length = scanner1.nextDouble();
                    double width = scanner2.nextDouble();

                    if (height < 0 || length < 0 || width < 0) {
                        throw new Exception("Data entered incorrectly!!!");
                    }

                    System.out.println("Parallelepiped area is " + parallelepiped.parallelepipedArea(height, length, width));
                    System.out.println("Parallelepiped size is " + parallelepiped.parallelepipedSize(height, length, width));

                } catch (InputMismatchException e){
                    System.out.println("Wrong input!!!");
                }

                break;
            case 2:
                System.out.println("Enter data for Cylinder - height and radius : ");

                Scanner scanner3 = new Scanner(System.in);
                Cylinder cylinder = new Cylinder();

                try {
                    double heightCylinder = scanner3.nextDouble();
                    double radiusCylinder = scanner3.nextDouble();

                    if (heightCylinder < 0 || radiusCylinder < 0) {
                        throw new Exception("Data entered incorrectly!!!");
                    }

                    System.out.println("Cylinder area is " + cylinder.cylinderArea(heightCylinder, radiusCylinder));
                    System.out.println("Cylinder size is " + cylinder.cylinderSize(heightCylinder, radiusCylinder));

                }
                catch (InputMismatchException e){
                     System.out.println("Wrong input");
                }

                break;
        }
    }
}