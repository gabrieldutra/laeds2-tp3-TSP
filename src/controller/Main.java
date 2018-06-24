package controller;

import util.FileWorker;

/**
 *
 * @author gabriel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[][] testMatrix = FileWorker.extractAdjacencyMatrix("datasets/treated_si535.tsp", 535);
    }
}
