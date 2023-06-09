/*
 * Author:  Iam Anais Ponsonnet, aponsonnet2021@fit.edu
 * Course:  CSE 2010, Section 02, Spring 2022
 * Project:  Predator-Prey Simulation
 */
// Simulator.java --  Simulate a world of living things through several generations

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
class Simulation {
    final static Random RNG = new Random (Long.getLong ("seed", System.nanoTime()));

    // List of predators/preys in the field.
    public static Map predatorPrey, nextPrey;

    static void init(int size){
        predatorPrey = new Map(size);
        nextPrey = new Map(size);

        for (int row=1; row<size-1; row++) {
            for (int col=1; col<size-1; col++) {
                predatorPrey.set(row, col, gen());
            }
        }
    }

   static Living gen () {
        final double x = RNG.nextDouble();
                if (x < 0.1)      return /* 10% Fox    */ new Fox(); // new Fox
                else if (x < 0.3) return /* 20% Rabbit */new Rabbit();
                else if (x < 0.6) return /* 30% Grass  */ new Grass();
                else              return /* 40% Empty  */ new Empty();
            
    }

    public static void main (final String[] args) {

        int size = Integer.parseInt(args[0]);
        final int cycle = Integer.parseInt(args[1]);

        // initialize

        init(size);
        for (int cycl = 0; cycl<= cycle; cycl++){
            System.out.println("Cycle = " + cycl);
            System.out.println( predatorPrey);

            // Active details for debug
            // System.out.println( predatorPrey.Details());

            // prepare next gen map
            for (int row=1; row<size-1; row++) {
                for (int col=1; col<size-1; col++) {

                    Field field = predatorPrey.getField(row, col);
                    nextPrey.set(row, col, predatorPrey.get(row, col).next( field));
                }
            }

            // next generation take place
            for (int row=1; row<size-1; row++) {
                for (int col=1; col<size-1; col++) {
                    predatorPrey.set(row, col, nextPrey.get(row,col));
                }
            }

    }

    }
}




  

