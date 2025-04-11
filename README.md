# WorldSimulation
This project simulates a world inhabited by three living entities: foxes, rabbits, and grass, evolving through multiple generations. The state of each square in the world is determined solely by the eight surrounding neighboring squares. The rules for death, survival, and reproduction in this world are based on the interactions between these entities, and they are as follows:

Foxes: A fox will starve if it is surrounded by more than 5 other foxes, or if there are no rabbits nearby. Additionally, a fox will die after 5 world cycles if it doesn't meet certain survival criteria.

Rabbits: A rabbit will starve if there is no grass in its vicinity. If there are foxes nearby, and the number of foxes is greater than or equal to the number of rabbits in the area, the rabbit will be eaten. A rabbit also dies after 3 world cycles.

Grass: Grass is replaced by a new rabbit if the number of neighboring grass squares is more than twice the number of rabbits in the area. If there are more grass squares than rabbits, the grass survives; otherwise, it dies off.

For empty squares:

A new fox will appear if more than two rabbits are nearby.

A new rabbit will appear if more than four grass squares are nearby.

New grass will grow if there is any grass in the surrounding area.

The simulation runs through successive world cycles, allowing these rules to govern the evolution of the entities and their interactions over time.
# Output
<img width="569" alt="image" src="https://github.com/Akuskea/WorldSimulation/assets/102030185/f5e80857-a956-4bae-9005-c4bfcd3cf670">

