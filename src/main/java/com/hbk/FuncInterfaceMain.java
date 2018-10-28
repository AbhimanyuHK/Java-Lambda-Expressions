/**
 * 
 */
package com.hbk;

/**
 * @author abhimanyu_h_k
 *
 */
public class FuncInterfaceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FuncInterface square = (int x) -> System.out.println(x * x);
		square.abstractFun(5);

	}
}
