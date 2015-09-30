package view;

import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;

public class Maze3d extends Maze3dViewDisplayer {

	
	
	public Maze3d(Composite parent, int style) {
		super(parent, style);
		// set a white background   (red, green, blue)
    	setBackground(new Color(null, 255, 255, 255));
    	addPaintListener(new PaintListener() {
			
			@Override
			public void paintControl(PaintEvent e) {
				   e.gc.setForeground(new Color(null,0,0,0));
				   e.gc.setBackground(new Color(null,0,0,0));

				   int width=getSize().x;
				   int height=getSize().y;

				   int w=width/maze.getMaze3d()[0].length;
				   int h=height/maze.getMaze3d().length;

				   for(int i=0;i<maze.getMaze3d().length;i++)
				      for(int j=0;j<maze.getMaze3d()[i].length;j++){
				          int x=j*w;
				          int y=i*h;
//				          if(maze.getMaze3d()[i][j]!=0)
				              e.gc.fillRectangle(x,y,w,h);
				      }
				}
		});
	}

	
	

}
