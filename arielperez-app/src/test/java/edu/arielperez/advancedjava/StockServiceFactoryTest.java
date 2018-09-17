package edu.arielperez.advancedjava;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockServiceFactoryTest {

	StockService testStockService = StockServiceFactory.getSockService("ALL");

	@Test
	public void testFactoryClass() {
		assertTrue(testStockService instanceof StockService);
	}

	@Test
	public void negTestFactoryClass() {
		assertFalse(!(testStockService instanceof StockService));
	}

}
