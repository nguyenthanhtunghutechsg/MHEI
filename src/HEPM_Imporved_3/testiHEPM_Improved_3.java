package HEPM_Imporved_3;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import Stock_Package.Stock;

// dEFIM TESTER, OUTPUT TO SCREEN
public class testiHEPM_Improved_3 {

	public static void main(String[] arg) throws IOException {
		String input = "chainstore.txt";
		String input2 = "chainstoreInvest.txt";
		Stock stock = new Stock();
		stock.loadFile(input2);
		double minEffiency = 100;
		int dbSize =  Integer.MAX_VALUE;
		AlgoHEPM_improved_3 algo = new AlgoHEPM_improved_3(); // Create the dEFIM algorithm object

		// execute the algorithm
		Itemsets itemsets = algo.runAlgorithm(minEffiency, input, null, stock, true, dbSize, true);

		algo.printStats(); // Print statistics
		// itemsets.printItemsets(); // Print the itemsets
	}
}
