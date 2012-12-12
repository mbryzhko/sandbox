package bma.sandbox;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MyListTest {
	
	@Test
	public void addSingleElement() {
		// given
		String value = "Given";
		MyList<String> list = new MyList<String>();
		
		// when
		list.add(value);
		
		// then
		assertThat(list, is(new MyList<String>("Given")));
	}
	
}
