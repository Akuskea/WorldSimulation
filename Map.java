import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Map {
	ArrayList<ArrayList<Living>> prey;

	Map(int size) { 
		prey = new ArrayList<ArrayList<Living>>(size);
        for (int row=0; row<size; row++) {
			prey.add(row, new ArrayList<Living>(size));
			for (int col = 0; col < size ; col++){
				prey.get(row).add(col, new Empty());
			}
		}
	}

	public void set(int row, int col, Living living) {
		prey.get(row).set(col, living);
	}

	public Living get(int row, int col) {
		return prey.get(row).get(col);
	}

	public Field getField(int row, int col) {
		Living [] neighbors = new Living[8];

		neighbors[0]= get(row+1, col);
		neighbors[1]= get(row+1, col+1);
		neighbors[2]= get(row+1, col-1);
		neighbors[3]= get(row-1, col);
		neighbors[4]= get(row-1, col-1);
		neighbors[5]= get(row-1, col+1);
		neighbors[6]= get(row, col-1);
		neighbors[7]= get(row, col+1);

		return new Field( neighbors);
	}

	public String toString() {
		String line = "";
        for (int row=0; row<prey.size(); row++) {
			for (int col = 0; col < prey.get(row).size() ; col++){
				line += get(row, col).getCharRepresentation();
			}
			line += "\n";
		}
		return line;
	}

	public String Details() {
		String block = "";
        for (int row=0; row<prey.size(); row++) {
			String line[] = new String[5];

			for (int i= 0; i < 5; i++){
				line[i] = new String();
			}
			for (int col = 0; col < prey.get(row).size() ; col++){
				line[0] += "______";
				if (row == 0 || row == prey.size()-1 || col == 0 || col == prey.get(row).size()-1) {
					line[1] += "|.....";
					line[2] += "|.....";
					line[3] += "|.....";
					line[4] += "|.....";
				} else {
					line[1] += "|" + get(row, col).getCharRepresentation() + "    "; // + " = "+get(row, col).getCycles();
					Field field = getField(row, col);
					line[2] += "|X : " + field.getCount(Fox.class);
					line[3] += "|G : " + field.getCount(Grass.class);
					line[4] += "|R : " + field.getCount(Rabbit.class);
				}
			}
			for (int i= 0; i < 5; i++){
				block += line[i] + "|\n";
			}
			if (row == prey.size()-1) {
				block += line[0];
			}
		}
		return block;
	}
}
