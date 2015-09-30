package presenter;

import java.io.Serializable;

public class Properties implements Serializable {

	String solvingAlgo;
	int numOfThreads;
	int maxX;
	int maxY;
	int maxZ;
	int dimensions;
	
	public String getSolvingAlgo() {
		return solvingAlgo;
	}
	public void setSolvingAlgo(String solvingAlgo) {
		this.solvingAlgo = solvingAlgo;
	}
	public int getNumOfThreads() {
		return numOfThreads;
	}
	public void setNumOfThreads(int numOfThreads) {
		this.numOfThreads = numOfThreads;
	}
	public int getMaxX() {
		return maxX;
	}
	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}
	public int getMaxY() {
		return maxY;
	}
	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}
	public int getMaxZ() {
		return maxZ;
	}
	public void setMaxZ(int maxZ) {
		this.maxZ = maxZ;
	}
	public int getDimensions() {
		return dimensions;
	}
	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}
	
	
}
