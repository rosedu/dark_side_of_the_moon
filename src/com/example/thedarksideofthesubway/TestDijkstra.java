package com.example.thedarksideofthesubway;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestDijkstra {

  private List<Vertex> nodes;
  private List<Edge> edges;

  public Vector<String> testExcute(int source, int destination) {
    nodes = new ArrayList<Vertex>();
    edges = new ArrayList<Edge>();
    for (int i = 0; i < 11; i++) {
      Vertex location = new Vertex("Node_" + i, "Node_" + i);
      nodes.add(location);
    }

    MatrixMadness.generateNormalMatrix();
    int[][] matrix = MatrixMadness.getMatrix();
    for(int i = 0; i < 45; i++) {
    	for(int j = 0; j < 45; j++) {
	    	addLane("Edge_" + i, i, j, matrix[i][j]);
	    }
   	}
    
    // Lets check from location Loc_1 to Loc_10
    Graph graph = new Graph(nodes, edges);
    DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
    dijkstra.execute(nodes.get(source));
    LinkedList<Vertex> path = dijkstra.getPath(nodes.get(destination));
    Vector<String> result = new Vector<String>();
    if(path.size() == 0) {
    	return new Vector<String>();
    } else {
    	for (Vertex vertex : path) {
    		result.add(vertex.getName() + ", ");
    	}
    	 return result;
    }
    
    
    
  }

  private void addLane(String laneId, int sourceLocNo, int destLocNo, int duration) {
    Edge lane = new Edge(laneId, nodes.get(sourceLocNo), nodes.get(destLocNo), duration);
    edges.add(lane);
  }
} 