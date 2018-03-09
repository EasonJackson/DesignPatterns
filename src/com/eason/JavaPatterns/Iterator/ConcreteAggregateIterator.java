package com.eason.JavaPatterns.Iterator;

import java.util.List;

/**
 * Created by easonjackson on 3/9/18.
 */
public class ConcreteAggregateIterator implements IteratorInterface {

    private ConcreteAggregateExample concreteAggregateExample;
    private int index;

    ConcreteAggregateIterator(ConcreteAggregateExample concreteAggregateExample) {
        this.concreteAggregateExample = concreteAggregateExample;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index > this.concreteAggregateExample.collectionObjs.size();
    }

    @Override
    public Object next() {
        return this.concreteAggregateExample.collectionObjs.get(index++);
    }
}
