package py.edu.uc.lp3.maven;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Puede ser numero: " + NumberUtils.isCreatable("1"));
		System.out.println("Puede ser numero: " + NumberUtils.isCreatable("algo"));

	}
}