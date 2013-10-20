package com.example.thedarksideofthesubway;

import java.util.ArrayList;
import java.util.Hashtable;

public class HashReg {

	static Hashtable<String, Subway> goHashTable = new Hashtable<String, Subway>();
	static ArrayList<Subway> subwayArray = new ArrayList<Subway>();

	////TODO after Dan's xml stff
	
	public HashReg() {
		
	}
	
	public static void addStation(String station) 
	{
		Subway subway = new Subway();
		goHashTable.put(station, subway);
		subwayArray.add(subway);
	}
	
	public static void addStations(ArrayList<String> stations)
	{
		for(int index=0;index<stations.size();index++)
		{
			addStation(stations.get(index));
		}
	}
	
	public static void addRATB(String subway, String nearRATB)
	{
		goHashTable.get(subway).addRATB(nearRATB);
	}
	public static void addObjective(String subway,String nearObjectiveName, String nearObjectiveAddress)
	{
		goHashTable.get(subway).addObjective(nearObjectiveName, nearObjectiveAddress);
	}
	
	public static void addDetails()
	{
		
	}

	

}