package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.biggest.biggest.BiggestNumberBrother;

/**
 * <b>TestBiggestNumberBrotherTest</b>
 * @package com.biggest.biggest
 * @author Luiz Rodrigues
 * @copyrigth © 09/2020
 * @version 1.0
 */
public class TestBiggestNumberBrotherTest {
	@Test
	public void testBiggestNumberBrother() throws Exception {
		BiggestNumberBrother biggestNumber = new BiggestNumberBrother();
		
		/**
		 * Testa um número dentro da faixa de 0 a 2147483647 como entrada
		 */
		int biggestMiddle = biggestNumber.biggestNumberBrother(213);
		assertEquals(biggestMiddle, 321);
		
		/**
		 * Testa o limite superior dentro da faixa de 0 a 2147483647
		 */
		int biggestHigherInt = biggestNumber.biggestNumberBrother(2147483647);
		assertEquals(biggestHigherInt, 0);
		
		/**
		 * Testa o limite inferior aceito pela especificação
		 */
		int biggestLimitInferior = biggestNumber.biggestNumberBrother(0);
		assertEquals(biggestLimitInferior, 0);
		
		/**
		 * Testa o limite superior aceito pela especificação
		 */
		int biggestLimitHigher = biggestNumber.biggestNumberBrother(100000000);
		assertEquals(biggestLimitHigher, 100000000);
		
		/**
		 * Testa o limite superior excedido aceito pela especificação
		 */
		int biggestLimitHigherExceeded = biggestNumber.biggestNumberBrother(100000001);
		assertEquals(biggestLimitHigherExceeded, -1);
		
		/**
		 * Testa uma entrada com valor negativo
		 */
		int biggestNegativeNumber = biggestNumber.biggestNumberBrother(-1);
		assertEquals(biggestNegativeNumber, 0);
	}
}
