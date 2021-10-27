package generics;

public class AccountBounded<T extends Number>{

	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}



}
