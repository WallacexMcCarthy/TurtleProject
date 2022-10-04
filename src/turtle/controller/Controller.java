package turtle.controller;

import java.awt.Color;

import media.model.*;

public class Controller 
{
	public Controller()
	{
		
	}
	public void start()
	{
		World myFirstWorld = new World(false);
		Turtle myTurtle = new Turtle(myFirstWorld);
		
		myTurtle.forward(30);
		Turtle otherTurtle = new Turtle(myFirstWorld);
		Turtle seondTurtle = new Turtle(myFirstWorld);
		otherTurtle.setColor(Color.CYAN);
		otherTurtle.backward(40);
		otherTurtle.turnRight();
		otherTurtle.forward(80);
		
		for (int index = 0; index < 1000; index++)
		{
			myTurtle.turn(45);
			myTurtle.forward(100);
			
			int randomTurn = (int) (Math.random()*90);
			int randomDistance = (int) (Math.random() * 91) + 10;
			
			otherTurtle.turn(randomTurn);
			otherTurtle.backward(randomDistance);
			otherTurtle.setColor(Color.blue);
			seondTurtle.turn(randomTurn);
			seondTurtle.backward(randomDistance);
		}
		for (int index = 0; index < 500; index++)
		{
			
			int randomTurn = (int) (Math.random()*40);
			int randomDistance = (int) (Math.random() * 91);

			otherTurtle.turn(randomTurn);
			otherTurtle.backward(randomDistance);
			otherTurtle.setPenWidth((int)(index * 0.01));
			otherTurtle.setColor(Color.magenta);
			
			
		}

		
		myFirstWorld.setVisible(true);
	}
	
}
