package presenter;

import java.io.Serializable;

public class Properties implements Serializable {

	String solvingAlgo;
	int numOfThreads;
	int sizeX;
	int sizeY;
	int sizeZ;
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
	public int getSizeX() {
		return sizeX;
	}
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	public int getSizeY() {
		return sizeY;
	}
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	public int getSizeZ() {
		return sizeZ;
	}
	public void setSizeZ(int sizeZ) {
		this.sizeZ = sizeZ;
	}
	public int getDimensions() {
		return dimensions;
	}
	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}
	
	
}
