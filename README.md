# WorldSimulation
Simulate a world of living things through several generations. In this world there are three living things: foxes, rabbits, and grass. 
The next inhabitant at a spot in the world is determined only by the 8 neighboring squares surrounding the spot. Here are the rules for death and procreation in the world.
A fox starves if it is surrounded by over 5 other foxes, or if there are no rabbits nearby; a fox will die after 5 world-cycles.
A rabbit starves if there is no grass nearby; a rabbit is eaten if there is fox nearby and there are more or equal numbers of foxes than rabbits in the neighborhood; a rabbit dies after 3 world-cycles.
Grass is replaced by a new rabbit, if the grass nearby totals more than twice the number of rabbits nearby; and if grass nearby is more than rabbits nearby then it remains else it dies out.
An empty square produces a new fox if more than two rabbits are nearby; else a new rabbit if more than four grass squares are nearby; else some new grass if there is any grass nearby.
