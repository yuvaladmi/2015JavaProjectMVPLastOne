package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;

public class MyObservableGUIView extends MyAbstractObservableGuiView {

	protected MazeWindow maze;
	
	public MyObservableGUIView(String title, int width, int height) {
		maze = new MazeWindow(title, width, height);
		maze.setKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent key) {
				switch (key.keyCode) {
				case SWT.ARROW_UP:
//					maze.
					
					break;

				default:
					break;
				}
				
			}
		});
		}
	
	@Override
	public void displayByte(byte[] arr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayString(String arr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayInt(int[][] arr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

}
