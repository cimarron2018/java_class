package edu.arielperez.advancedjava;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicStockServiceTest {

	BasicStockService testBasicStockService = new BasicStockService();
	StockQuote testQuote = testBasicStockService.getQuote("ALL");

	@Test
	public void testGetQuote() {
		assertTrue(testQuote.getStockPrice().doubleValue() == 99.99);
	}

	@Test
	public void negTestGetQuote() {
		assertFalse(!(testQuote.getStockPrice().doubleValue() == 99.99));
	}

}
