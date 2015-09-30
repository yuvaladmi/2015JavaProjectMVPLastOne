package view;

import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

import algorithms.mazeGenerators.Maze3d;
import algorithms.mazeGenerators.Position;

public abstract class Maze3dViewDisplayer extends Canvas {

	protected Maze3d maze;
	protected Position position;
	
	public Maze3dViewDisplayer(Composite parent, int style) {
		super(parent, style);
		position =new Position(0,0,0);
	}
	public void setMazeData(Maze3d m){
		this.maze=m;
	}
	
	


}
