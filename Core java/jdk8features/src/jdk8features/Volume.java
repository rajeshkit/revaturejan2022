package jdk8features;

@FunctionalInterface
public interface Volume {
	int square(int l,int b);
	default public void add(int a,int b) {
		
	}
	static public void multiply() {
		
	}
}
