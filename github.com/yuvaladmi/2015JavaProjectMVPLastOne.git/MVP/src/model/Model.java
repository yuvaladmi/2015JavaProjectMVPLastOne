package model;

import algorithms.mazeGenerators.Maze3d;

public interface Model {
    public void dirToPath(String[] arr);

    public void generateMaze(String[] arr);

    public Maze3d sendGame(String arr);

    public int[][] crossSection(String[] arr);

    public void save(String[] arr);

    public void load(String[] arr);

    public void solve(String[] arr);

    public String bringSolution(String arr);

    public void gameSize(String[] arr);

    public void fileSize(String[] arr);

    public void close();
   
}
