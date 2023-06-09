/*
 * Author:  Iam Anais Ponsonnet, aponsonnet2021@fit.edu
 * Course:  CSE 2010, Section 02, Spring 2022
 * Project:  Predator-Prey Simulation
 */
// Simulator.java --  Simulate a world of living things through several generations

interface Living {
   Living next (Neighborhood n); // next generation
   char getCharRepresentation ();
}

