package view;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;

public class Maze3D extends Maze3dViewDisplayer {

    protected char pivot;
    protected int index;

    public Maze3D(Composite parent, int style, char pivot) {
	super(parent, style);
	this.pivot = pivot;
	this.index = 0;
	// set a white background (red, green, blue)
	setBackground(new Color(null, 255, 255, 255));
	addPaintListener(new PaintListener() {

	    @Override
	    public void paintControl(PaintEvent e) {
		if (maze != null) {
		    e.gc.setForeground(new Color(null, 0, 0, 0));
		    e.gc.setBackground(new Color(null, 0, 0, 0));

		    int width = getSize().x;
		    int height = getSize().y;
		    int firstSize = 0;
		    int secondSize = 0;

		    int[][] crossMaze = null;
		    switch (pivot) {
		    case 'x':
			firstSize = maze.getY();
			secondSize = maze.getZ();
			index = position.getX();
			crossMaze = maze.getCrossSectionByX(index);
			break;
		    case 'y':
			firstSize = maze.getX();
			secondSize = maze.getZ();
			index = position.getY();
			crossMaze = maze.getCrossSectionByY(index);

			break;
		    case 'z':
			firstSize = maze.getX();
			secondSize = maze.getY();
			index = position.getZ();
			crossMaze = maze.getCrossSectionByZ(index);

			break;
		    default:
			firstSize = maze.getY();
			secondSize = maze.getZ();
			index = position.getX();
			crossMaze = maze.getCrossSectionByX(index);

			break;
		    }

		    int w = width / firstSize;
		    int h = height / secondSize;
		    for (int i = 0; i < firstSize; i++)
			for (int j = 0; j < secondSize; j++) {
			    int x = j * w;
			    int y = i * h;
			    if (crossMaze[i][j] != 0)
				e.gc.fillRectangle(x, y, w, h);
			}
		}
	    }
	});

    }
}
