/**
 * 
 */
package com.test;

import com.annotation.TestAnnotation;

/**
 * @author Tsvetelin
 *
 */
@TestAnnotation
public class TestClass {

	@TestAnnotation
	public final int test = 0;
	
	@TestAnnotation
	public TestClass() {}
	
	@TestAnnotation
	public void test() {}
}
