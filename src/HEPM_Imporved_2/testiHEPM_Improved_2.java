package HEPM_Imporved_2;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import Stock_Package.Stock;

// dEFIM TESTER, OUTPUT TO SCREEN
public class testiHEPM_Improved_2 {

	public static void main(String[] arg) throws IOException {
		String input = "connect.txt";
		String input2 = "connectInvest.txt";
		Stock stock = new Stock();
		stock.loadFile(input2);
		double minEffiency = 800;
		//49046 990002 340183 59602 1112949 3196 67557 88162;
		int dbSize = 67557*75/100;
		AlgoHEPM_improved_2_2 algo = new AlgoHEPM_improved_2_2(); // Create the dEFIM algorithm object

		// execute the algorithm
		Itemsets itemsets = algo.runAlgorithm(minEffiency, input, null, stock, true, dbSize, true);

		algo.printStats(); // Print statistics
		// itemsets.printItemsets(); // Print the itemsets
	}
}
