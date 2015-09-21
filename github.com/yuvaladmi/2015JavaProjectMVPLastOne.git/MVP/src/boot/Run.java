package boot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import model.Maze3dModel;
import presenter.Presenter;
import view.Maze3dView;

public class Run {
    public static void main(String[] args) {
	Maze3dModel m = new Maze3dModel();
	Maze3dView v = new Maze3dView(new BufferedReader(new InputStreamReader(System.in)), new PrintWriter(System.out));
	Presenter p = new Presenter(m, v);
	m.addObserver(p);
	v.addObserver(p);
	v.start();
    }
}