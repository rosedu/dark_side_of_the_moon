package com.example.thedarksideofthesubway;

import java.util.Hashtable;

public class GoPress {
	
	private String source;
	private String destination;
	
	public GoPress() {
		Subway infoSource = getSource();
		Subway infoDestination = getDestination();
	}
	
	public Subway getSource() {
		return HashReg.goHashTable.get(source);
	}
	
	public Subway getDestination() {
		return HashReg.goHashTable.get(destination);
	}
}