package com.example.thedarksideofthesubway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
	Spinner mySpinner,mySpinner2;
	XmlResourceParser  XMLFile;
	List<Subway> list=null;
	static ArrayList<String> stations = new ArrayList<String>();
	static Hashtable<String, Integer> syncHashTable = new Hashtable<String, Integer>();
	static int count = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Resources res = getResources();
		AssetManager am = getAssets();
		String stringXmlContent;
		try {
			getEventsFromAnXML(this);
		} catch (XmlPullParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XMLFile = res.getXml(R.xml.subway);
		GetXMLData(XMLFile);
		HashReg.addStations(stations);
		// use default spinner item to show options in spinner
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,stations);
		ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,stations);
		mySpinner = (Spinner) findViewById(R.id.dropDownSoruce);
		mySpinner2 = (Spinner) findViewById(R.id.dropDownDestination);
		mySpinner.setAdapter(adapter);
		mySpinner2.setAdapter(adapter);
	}

	public void GetXMLData(XmlResourceParser XMLData)
	{

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	private  void getEventsFromAnXML(Activity activity)
			throws XmlPullParserException, IOException
			{
		Resources res = activity.getResources();
		XmlResourceParser xpp = res.getXml(R.xml.subway);
		xpp.next();
		int eventType = xpp.getEventType();
		Subway station = null;
		while (eventType != XmlPullParser.END_DOCUMENT)
		{

			if(eventType == XmlPullParser.START_TAG)
			{
				if(xpp.getName().equalsIgnoreCase("station"))
				{
					station = new Subway();
					eventType = xpp.next();

				}
				if(xpp.getName().equalsIgnoreCase("name"))
				{
					while(eventType != XmlPullParser.END_TAG)
					{
						eventType = xpp.next();
						if(eventType == XmlPullParser.TEXT)
						{
							station.name = xpp.getText();
							stations.add(station.name);
						}
					}
				}
			}
			else if(eventType == XmlPullParser.END_TAG)
			{
				if(xpp.getName().equalsIgnoreCase("name"))
				{

				}
			}
			else if(eventType == XmlPullParser.TEXT)
			{
			}
			eventType = xpp.next();
		}
			}

	public void getStations() throws XmlPullParserException, IOException {
		getEventsFromAnXML(this);
	}

	public void buildSyncHashTable() throws XmlPullParserException, IOException {
		getStations();
		ArrayList<String> stationss = new ArrayList<String>();
		for(int i = 0; i < 45; i++) {
			stationss.add(stations.get(i));
		}
		for(int i = 0; i < stationss.size(); i++) {
			syncHashTable.put(stationss.get(i), i);
		}
	}

	public void alertMeYouBastard(View view) throws XmlPullParserException, IOException {
		buildSyncHashTable();
		String source = mySpinner.getSelectedItem().toString(); 
		String destination = mySpinner2.getSelectedItem().toString(); 
		TestDijkstra test = new TestDijkstra();
		String me = new String("");
		me += test.testExcute(syncHashTable.get(source), syncHashTable.get(destination)).get(0);
		new AlertDialog.Builder(this)
			.setTitle("Mergi")
			.setMessage("Watch out!")
			.setNegativeButton("Cancel", null)
			.setPositiveButton("Meh", null)
			.show();  
	}

	
}
