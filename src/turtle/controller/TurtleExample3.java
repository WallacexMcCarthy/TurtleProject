package turtle.controller;

import media.model.*;


public class TurtleExample3 {
	  public static void main(String[] args) {
	    World earth;
	    Turtle oogway;
	    earth = new World();
	    oogway = new Turtle(earth);
	    oogway.forward(100);
	    oogway.turnRight(); 
	   }
	}


