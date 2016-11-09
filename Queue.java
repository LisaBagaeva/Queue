package Queue;

import LinckedListV2.LinkedListV2;

public class Queue<E> {
	private LinkedListV2<E> elementData = new LinkedListV2<>();

	public Queue() {};

	public boolean push(E element) {
		return elementData.add(element);
	}

	public E remove() {
		E value = elementData.getFirst().getValue();
		elementData.remove(elementData.getFirst().getValue());
		return value;
	}

	public E element() {
		return elementData.getFirst().getValue();
	}

	public int getSize() {
		return elementData.size();
	}

}
