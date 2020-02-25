package q3;

class Triple<T extends Number & Comparable<T>> {
	private T value1;
	private T value2;
	private T value3;

	public Triple(T v1, T v2, T v3){
		value1 = v1;
		value2 = v2;
		value3 = v3;
	}

	public T readValue1() {
		return value1;
	}
	
	public void setValue1(T val) {
		value1=val;
	}

	public double addValues() {
		return value1.doubleValue() + value2.doubleValue() + value3.doubleValue();
	}

	public T largest(){
		T res = value1;
		if(value2.compareTo(res) > 0) res = value2;
		if(value3.compareTo(res) > 0) res = value3;
		return res;
	}
}
