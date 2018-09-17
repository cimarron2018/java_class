package edu.arielperez.advancedjava;

import java.math.BigDecimal;
import java.util.Date;

public class StockQuote {

	private String stockSymbol;
	private BigDecimal stockPrice;
	private Date dateRecorded;

	/**
	 * @param stockSymbol
	 * @param stockPrice
	 * @param dateRecorded
	 */
	public StockQuote(String stockSymbol, BigDecimal stockPrice, Date dateRecorded) {
		super();
		this.stockSymbol = stockSymbol;
		this.stockPrice = stockPrice;
		this.dateRecorded = dateRecorded;
	}

	/**
	 * @return the stockSymbol
	 */
	public String getStockSymbol() {
		return stockSymbol;
	}

	/**
	 * @param stockSymbol the stockSymbol to set
	 */
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	/**
	 * @return the stockPrice
	 */
	public BigDecimal getStockPrice() {
		return stockPrice;
	}

	/**
	 * @param stockPrice the stockPrice to set
	 */
	public void setStockPrice(BigDecimal stockPrice) {
		this.stockPrice = stockPrice;
	}

	/**
	 * @return the dateRecorded
	 */
	public Date getDateRecorded() {
		return dateRecorded;
	}

	/**
	 * @param dateRecorded the dateRecorded to set
	 */
	public void setDateRecorded(Date dateRecorded) {
		this.dateRecorded = dateRecorded;
	}

}
