package annotationdemo;

import jdk.jfr.BooleanFlag;
@SuppressWarnings(value = { "fdf" })
class TestDemo{
	@BooleanFlag
	int k; 
	
	public void show() {
		
	}
}
public class Demo extends TestDemo{
	@Override
	public void show() {
		
	}
}
