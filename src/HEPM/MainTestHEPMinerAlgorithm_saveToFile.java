package HEPM;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import Stock_Package.Stock;

public class MainTestHEPMinerAlgorithm_saveToFile {
	public static void main(String[] arg) throws IOException {
		String input = "connect.txt";
		String input2 = "connectInvest.txt";
		String output = ".//output2.txt";
		double minEffiency = 800; //
		int dbSize =  67557*75/100;
		//49046 990002 340183 59602 1112949 3196 67557 88162;
		Stock stock = new Stock();
		stock.loadFile(input2);
		// Applying the HUIMiner algorithm
		AlgoHEPMiner algoHEPMiner = new AlgoHEPMiner();
		algoHEPMiner.runAlgorithm(input, output, stock, minEffiency, dbSize);
		algoHEPMiner.printStats();

	}
}
