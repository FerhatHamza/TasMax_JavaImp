package tasmaximp;

import java.util.ArrayList;
import javax.swing.JLabel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JLabel;

public class tas {

    int X;
    int Y;

    public tas(int X,int Y) {
        this.X = X;
        this.Y = Y;

    }

    public static ArrayList<JLabel> list = new ArrayList<JLabel>();
    public static ArrayList<tas> index = new ArrayList<tas>();

    public void remplir(JLabel value,tas postion ) {
        list.add(value);
        index.add(postion);
    }

}

