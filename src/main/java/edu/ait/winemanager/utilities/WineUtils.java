package edu.ait.winemanager.utilities;

import java.util.List;

import edu.ait.winemanager.dto.Wine;

public class WineUtils {

	public double calculatePostage(Wine wine) {

		double price = wine.getPrice();

		double postage;

		if (price < 9) {
			postage = 0;
		} else if (price >= 9 && price < 10) {
			postage = 2.99;
		} else if (price >= 10 && price < 11) {
			postage = 3.99;
		} else if (price >= 12 && price < 13) {
			postage = 4.99;
		} else {
			postage = 4.99;
		}

		return postage;

	}

	public double countAllWines(List<Wine> wineList) {

		int total = wineList.stream().mapToInt(e -> e.getStock()).sum();

		return total;

	}

}
