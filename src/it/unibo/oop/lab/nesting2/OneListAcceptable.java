package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable <T> {
	private List <T> givenList;
	
	public OneListAcceptable(List <T> givenList){
		this.givenList = givenList;	
		
	}

	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			private Iterator <T> listIterator = givenList.iterator();
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if(!this.listIterator.hasNext() || this.listIterator.next() != newElement) {
					throw new ElementNotAcceptedException(newElement);
				}
			}

			@Override
			public void end() throws EndNotAcceptedException {
				if(!this.listIterator.hasNext()) {
					return;
				}			
				throw new EndNotAcceptedException();		
			}
			
		};
	}

}
