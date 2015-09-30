package boot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;

import model.Maze3dModel;
import presenter.Presenter;
import view.BasicWindow;
import view.Maze3dViewCLI;
import view.MazeWindow;

public class Run {
    public static void main(String[] args) {
//	Maze3dModel m = new Maze3dModel();
//	Maze3dViewCLI v = new Maze3dViewCLI(new BufferedReader(new InputStreamReader(System.in)), new PrintWriter(System.out));
//	Presenter p = new Presenter(m, v);
//	m.addObserver(p);
//	v.addObserver(p);
//	v.start();
BasicWindow bw = new MazeWindow("Maze Y&A", 500, 300);
		bw.run();
    }
}