package boletin17;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class XeometriaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPerimetroCadrado() {
		Xeometria xeometria = new Xeometria();
		assertEquals(-1, xeometria.perimetroCadrado(-2));
		assertEquals(4, xeometria.perimetroCadrado(1));
		assertEquals(-1, xeometria.perimetroCadrado(0));
		assertEquals(40, xeometria.perimetroCadrado(10));
	}

	@Test
	public void testAreaCadrado() {
		Xeometria xeometria = new Xeometria();
		assertEquals(-1, xeometria.areaCadrado(-2));
		assertEquals(4, xeometria.areaCadrado(2));
		assertEquals(-1, xeometria.areaCadrado(0));
		assertEquals(100, xeometria.areaCadrado(10));
	}

	@Test
	public void testTeoremaPitagorasIntInt() {
		Xeometria xeometria = new Xeometria();
		assertEquals(-1, xeometria.teoremaPitagoras(-2, -5), 0.01);
		assertEquals(25, xeometria.teoremaPitagoras(7, 24), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(0, 1), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(1, 0), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(0, -1), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(-1, 0), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(-2, 1), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(1, -2), 0.01);
		assertEquals(5.385, xeometria.teoremaPitagoras(2, 5), 0.001);
	}

	@Test
	public void testTeoremaPitagorasDoubleDouble() {
		Xeometria xeometria = new Xeometria();
		assertEquals(-1, xeometria.teoremaPitagoras(-2, -5), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(0, 1), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(0, -1), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(0, 0), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(1, 0), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(-1, 0), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(1.0, 2.0), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(-1, 1), 0.01);
		assertEquals(-1, xeometria.teoremaPitagoras(1, -1), 0.01);
		assertEquals(1, xeometria.teoremaPitagoras(2.24, 2), 0.01);
	}

}
