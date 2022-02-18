package hwork.lesson12.example;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App {
    public static void main(String args[])
    {
        // create a frame object for circle.
        Frame frame=new DrawCircle();
        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        // circle coordinates.
        frame.setSize(300, 250);
        frame.setVisible(true);
    }
}
