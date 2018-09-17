package edu.arielperez.advancedjava;

public class StockServiceFactory {

	/*
	 * A StockService factory class that returns a concrete implementation of the interface
	 * 
	 * @symbol the symbol stock symbol
	 */
	public static StockService getSockService(String symbol) {

		return new BasicStockService();

	}
}
