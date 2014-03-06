package rp.robotics.mapping;

import javax.swing.JFrame;

import rp.robotics.visualisation.GridMapVisualisation;

public class GridMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Map Viewer");

		// Create a simple map with no obstacles
		GridMap gridMap = LocalisationUtils.createRectangularGridMap(5, 5, 30);

		// Create a more complex map
		// GridMap gridMap = LocalisationUtils.createTrainingMap();

		// view the map with 2 pixels as 1 cm
		GridMapVisualisation mapVis = new GridMapVisualisation(gridMap, 2);

		// Update frame to display visualisation
		frame.add(mapVis);
		frame.pack();
		frame.setSize(800, 600);
		frame.setVisible(true);

		// Pick some point on the grid
		int x = 0;
		int y = 0;

		// GridPositionDistribution distriubutionDistribution;
		gridMap.rangeToObstacleFromGridPoint(x, y, Heading.PLUS_X);

	}
}
