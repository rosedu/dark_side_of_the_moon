package com.example.thedarksideofthesubway;
import java.util.ArrayList;
import java.util.Hashtable;
import android.*;


public class Subway {

	public ArrayList<String> nearRATB = new ArrayList<String>();
	public Hashtable<String, String> nearObjectives = new Hashtable<String, String>();
	public String name;
	private static int countStation = 0;
	public Subway()
	{
		countStation++;
	}
	
	public void addRATB(String station)
	{
		nearRATB.add(station);
	}
	
	public void addObjective(String attraction, String address)
	{
		nearObjectives.put(attraction, address);
	}
}

