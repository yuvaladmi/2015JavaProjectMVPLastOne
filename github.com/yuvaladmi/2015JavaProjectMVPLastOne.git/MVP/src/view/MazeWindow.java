package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Text;

import algorithms.mazeGenerators.Position;

public class MazeWindow extends BasicWindow {

	protected algorithms.mazeGenerators.Maze3d myMaze;
	protected Position currentPosition;
	protected KeyListener key;
	
	public MazeWindow(String title, int width, int height) {
		super(title, width, height);
	}

	public void setKeyListener(KeyListener key){
		this.key = key;
	}
	
	@Override
	public void initWidgets() { 
		shell.setLayout(new GridLayout(2,false));
//		Menu mainMenu = new Menu(shell, SWT.BAR);
//		MenuItem mi = new MenuItem(mainMenu, 0);
//		mi.setText("FILE");
		Button startButton=new Button(shell, SWT.PUSH);
		startButton.setText("Start");
		startButton.setLayoutData(new GridData(SWT.FILL, SWT.None, false, false, 1, 1));
		
		Maze3dViewDisplayer maze = new Maze3d(shell, SWT.BORDER);
		maze.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,true,1,2));
//		Text text=new Text(shell, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
//		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,3));
		
		Button solveButton=new Button(shell, SWT.PUSH);
		solveButton.setText("Solve");
		solveButton.setLayoutData(new GridData(SWT.NONE, SWT.NONE, false, false, 1,1));
		solveButton.setEnabled(true);

	}
	
//	public void setCharacterPosition(int x, int y, int z) {
//		// if(x>=0 && x<maze.getX() && y>=0 && y<maze.getY()
//		// &&z>=0&&z<maze.getZ()){
//		if (myMaze.getMaze3d()[x][y][z] == 0) {
//			currentPosition.setX(x);
//			currentPosition.setY(y);
//			currentPosition.setZ(z);
//			getDisplay().syncExec(new Runnable() {
//
//				@Override
//				public void run() {
//					redraw();
//				}
//			});
//		}
//	}

//	public void moveUp() {
//		int x = currentPosition.getX();
//		x++;
//		if (x < myMaze.getX())
//			setCharacterPosition(x, currentPosition.getY(), currentPosition.getZ());
//
//	}
//
//	public void moveDown() {
//		int x = currentPosition.getX();
//		x--;
//		if (x >= 0)
//			setCharacterPosition(x, currentPosition.getY(), currentPosition.getZ());
//
//	}
//
//	public void moveLeft() {
//		int z = currentPosition.getZ();
//		z--;
//		if (z >= 0)
//			setCharacterPosition(currentPosition.getX(), currentPosition.getY(), z);
//	}
//
//	public void moveRight() {
//		int z = currentPosition.getZ();
//		z++;
//		if (z < myMaze.getZ())
//			setCharacterPosition(currentPosition.getX(), currentPosition.getY(), z);
//
//	}
//
//	public void moveForward() {
//		int y = currentPosition.getY();
//		y++;
//		if (y < myMaze.getY())
//			setCharacterPosition(currentPosition.getX(), y, currentPosition.getZ());
//	}
//
//	public void moveBackward() {
//		int y = currentPosition.getY();
//		y--;
//		if (y >=0)
//			setCharacterPosition(currentPosition.getX(), y, currentPosition.getZ());
//		
//	}

}
