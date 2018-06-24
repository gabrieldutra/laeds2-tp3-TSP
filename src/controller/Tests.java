package controller;

import algorithms.bruteforce.BruteForce;


public class Tests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BruteForce sp1 = new BruteForce("inputs/si535.input");
		BruteForce sp2 = new BruteForce("inputs/si1032.input");
		BruteForce sp3 = new BruteForce("inputs/pa561.tsp.input");
		System.out.println(sp1);
		sp1.getGraph().print();
		System.out.println(sp2);
		System.out.println(sp3);	
	}

}
