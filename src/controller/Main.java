package controller;

import algorithms.heuristic.Heuristic;
import util.FileWorker;

/**
 *
 * @author gabriel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[][] testMatrix = FileWorker.extractAdjacencyMatrix("datasets/treated_si535.tsp", 535);
        Heuristic heuristic = new Heuristic(testMatrix, 535);
        heuristic.calculateHeuristic();
    }
}
