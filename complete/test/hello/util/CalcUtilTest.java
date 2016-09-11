package hello.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcUtilTest {

	@Test
	public void testAdd() {
		assert CalcUtil.add(2, 3)==5;
	}

	@Test
	public void testMulti() {
		assert CalcUtil.multi(2, 3)==6;
	}

}
