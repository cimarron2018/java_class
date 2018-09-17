package edu.arielperez.advancedjava;

import java.math.BigDecimal;
import java.util.Date;

/*
 * Basic implementation of the StockService interface
 */
public class BasicStockService implements StockService {

	/**
	 * Return the <CODE>StockData</CODE> for the given symbol for the given date.
	 * Used to get history data for the stock.
	 *
	 * @param symbol the stock symbol of the company you want a quote for. e.g. APPL
	 *               for APPLE
	 *
	 * @return a StockQuote instance
	 */
	@Override
	public StockQuote getQuote(String symbol) {

		BigDecimal price;
		// hard-coded values
		if (symbol.equalsIgnoreCase("ALL")) {
			price = new BigDecimal(99.99); // ALL -> Allstate Corporation
		} else {
			price = new BigDecimal(45.45);
		}
		return new StockQuote(symbol, price, new Date());
	}

}
