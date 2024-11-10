package HEPM_Imporved;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import Stock_Package.Stock;



// dEFIM TESTER, OUTPUT TO SCREEN
public class testiHEPM_Improved {

	public static void main(String [] arg) throws IOException{		
		String input = "DB_Utility.txt";
		String input2 = "Stock.txt";
		Stock stock=new Stock();
		stock.loadFile(input2);
		double minEffiency = 0.01;
		int dbSize = Integer.MAX_VALUE;
		AlgoHEPM_improved algo = new AlgoHEPM_improved();				// Create the dEFIM algorithm object
		
		// execute the algorithm
		Itemsets itemsets = algo.runAlgorithm(minEffiency, input, null,stock, true, dbSize, true);
		
		algo.printStats();							// Print statistics
		//itemsets.printItemsets();					// Print the itemsets
	}
}
