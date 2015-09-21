package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Observable;

/**
 * 
 * @author Yuval Admi & Afek Ben Simon
 * @since 19.09.2015 This class is responsible to start the all system. It gets
 *        a command, checks if it exists and sends an order to do it.
 *
 */
public class CommandManager extends Observable {

    private BufferedReader in;
    private PrintWriter out;
    Thread mainThread;

    /**
     * CTOR
     * 
     * @param in
     * @param out
     * @param hm
     */
    public CommandManager(BufferedReader in, PrintWriter out) {
	this.in = in;
	this.out = out;

    }

    /**
     * This method starts the whole project.
     */
    public void start() {

	// the main thread, asking the client what does he want to do next.
	mainThread = new Thread(new Runnable() {
	    public void run() {
		String line;
		try {
		    out.println("enter new command:");
		    out.flush();
		    while ((line = in.readLine().intern()) != "exit") {
			setChanged();
			notifyObservers(line);
		    }
		    out.println("bye bye");
		    out.flush();
		    setChanged();
		    notifyObservers("exit");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    }
	});
	mainThread.start();
    }

}
