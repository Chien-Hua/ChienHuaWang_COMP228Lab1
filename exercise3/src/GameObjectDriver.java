import java.util.Scanner;
import javax.swing.*;
public class GameObjectDriver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hua GameBox");
        GameObjectDriver Gameobject1 = new GameObjectDriver();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the State(True=alive, False=dead) for the Gameobject1:");
        Boolean state = input.nextBoolean();
        //Gameobject1.setState();
        System.out.println();

        System.out.println("Please enter the X coordinates for the center of Gameobject1:");
        double x = input.nextDouble();
        //Gameobject1.getX(x);
        System.out.println();

        System.out.println("Please enter the Y coordinates for the center of Gameobject1:");
        double y = input.nextDouble();
        //Gameobject1.getX(y);
        System.out.println();

        System.out.println("Please enter the Velocity for the Gameobject1:");
        double velocity = input.nextDouble();
        //Gameobject1.getVelocity(velocity);
        System.out.println();

        System.out.println("Please enter the Rotation for the Gameobject1:");
        double rotation = input.nextDouble();
        //Gameobject1.getRotation(rotation);
        System.out.println();

        GameObject gameObj1 = new GameObject(x, y, velocity, state, rotation);

        JOptionPane.showMessageDialog(frame,gameObj1.getGameObject());



    }
}

