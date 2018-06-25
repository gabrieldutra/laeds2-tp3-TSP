package controller;

import algorithms.heuristic.Heuristic;
import util.FileWorker;

/**
 *
 * @author gabriel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-- si1032.tsp -- ");
        int[][] testMatrix = FileWorker.extractAdjacencyMatrix("datasets/si1032.tsp", 1032, false);
        Heuristic heuristic = new Heuristic(testMatrix, 1032);
        heuristic.calculateHeuristic();
        
        System.out.println("");
        
        testMatrix = FileWorker.extractAdjacencyMatrix("datasets/pa561.tsp", 561, true);
        heuristic = new Heuristic(testMatrix, 561);
        heuristic.calculateHeuristic();
        
        System.out.println("");
        
        testMatrix = FileWorker.extractAdjacencyMatrix("datasets/si535.tsp", 535, false);
        heuristic = new Heuristic(testMatrix, 535);
        heuristic.calculateHeuristic();
    }
}
