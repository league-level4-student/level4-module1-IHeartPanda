package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] array = (T[]) new Object[0];

	public ArrayList() {

	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return array[loc];
	}

	public void add(T val) {
		T[] arrau = (T[]) new Object[array.length + 1];
		arrau[array.length] = val;
		for (int i = 0; i < array.length; i++) {
			arrau[i] = array[i];
		}
		array = arrau;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arrau = (T[]) new Object[array.length + 1];
		for (int i = 0; i < loc; i++) {
			arrau[i] = array[i];
		}
		arrau[loc] = val;
		for (int i = loc; i < array.length; i++) {
			arrau[i + 1] = array[i];
		}
		array = arrau;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] arrau = (T[]) new Object[array.length - 1];
		for (int i = 0; i < loc; i++) {
			arrau[i] = array[i];
		}
		for (int i = loc + 1; i < array.length; i++) {
			arrau[i - 1] = array[i];
		}
		array = arrau;
	}

	public boolean contains(T val) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return array.length;
	}
}